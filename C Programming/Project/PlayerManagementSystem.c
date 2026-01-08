/* ===========================
   Player Management System
   =========================== */

#include<stdio.h>
#include<stdlib.h>
#include<string.h>

typedef struct player
{
    int JerseyNo;
    char name[20];
    int Runs;
    int Wickets;
    int MatchesPlayed;
} Player;

void storePlayers(Player*, int*);
void addPlayer(Player**, int*, int*);
void removePlayer(Player*, int*);
int searchPlayerByJerseyNo(Player*, int, int);
int searchPlayerByName(Player*, int, char[]);
void updatePlayers(Player*, int);
void sortedPlayers(Player*, int);
void displayPlayers(Player*, int);
void topRunsWickets(Player*, int);

int main()
{
    int capacity = 10;
    Player *players = malloc(capacity * sizeof(Player));
    int size = 0;
    int choice = 0;

    printf("=======================================\n");
    printf("\n----- Player Management System -----\n");
    printf("\n=======================================\n");

    storePlayers(players, &size);

    while(1)
    {
        printf("\n------------------------------------\n");
        printf("               MAIN MENU\n");
        printf("\n------------------------------------\n");

        printf("Press 1 to Add Player.\n");
        printf("Press 2 to Remove Player.\n");
        printf("Press 3 to Search Player.\n");
        printf("Press 4 to Update Player Data.\n");
        printf("Press 5 to Display Sorted Players.\n");
        printf("Press 6 to Display All Players.\n");
        printf("Press 7 to Display Top 3 Run or Wicket Takers.\n");
        printf("Press 8 to Exit.\n");

        printf("\nEnter Your Choice: \n");
        scanf("%d", &choice);

        if(choice == 1)
        {
            addPlayer(&players, &size, &capacity);
        }
        else if(choice == 2)
        {
            removePlayer(players, &size);
        }
        else if(choice == 3)
        {
            int searchChoice;
            printf("\n------ SEARCH MENU ------\n");
            printf("Press 1 to Search by Jersey Number\n");
            printf("Press 2 to Search by Name \n");
            printf("Enter your choice: \n");
            scanf("%d", &searchChoice);

            if(searchChoice == 1)
            {
                int Jersey, res;
                int retry = 1;

                while(retry)
                {
                    printf("\nEnter Jersey Number to search: \n");
                    scanf("%d", &Jersey);

                    res = searchPlayerByJerseyNo(players, size, Jersey);

                    if(res != -1)
                    {
                        printf("\n%s found with %d Runs and %d Wickets.\n", 
                               players[res].name, players[res].Runs, players[res].Wickets);
                        break;
                    }
                    else
                    {
                        int ch;
                        printf("\nPlayer not found!\n");
                        printf("1. Enter Again\n");
                        printf("2. Go to Main Menu\n");
                        printf("Enter your choice: \n");
                        scanf("%d", &ch);
                        if(ch == 2)
                        {
                            break;
                        }
                    }
                }
            }
            else if(searchChoice == 2)
            {
                char name[20];
                printf("\nEnter Name to search: \n");
                scanf("%s", name);

                int res = searchPlayerByName(players, size, name);

                if(res != -1)
                {
                    printf("\n%s found with %d Runs and %d Wickets.\n", 
                           players[res].name, players[res].Runs, players[res].Wickets);
                }
                else
                {
                    printf("\nPlayer not found.\n");
                }
            }
            else
            {
                printf("\nInvalid Choice.\n");
            }
        }
        else if(choice == 4)
        {
            updatePlayers(players, size);
        }
        else if(choice == 5)
        {
            sortedPlayers(players, size);
        }
        else if(choice == 6)
        {
            displayPlayers(players, size);
        }
        else if(choice == 7)
        {
            topRunsWickets(players, size);
        }
        else if(choice == 8)
        {
            printf("\nExiting...\n");
            break;
        }
        else
        {
            printf("\nInvalid Choice.! Please Try Again...\n");
        }
    }

    free(players);
    return 0;
}

void storePlayers(Player* ptr, int* size)
{
    ptr[0].JerseyNo = 18; 
    strcpy(ptr[0].name, "Virat"); 
    ptr[0].Runs = 27473; 
    ptr[0].Wickets = 9; 
    ptr[0].MatchesPlayed = 551;

    ptr[1].JerseyNo = 45; 
    strcpy(ptr[1].name, "Rohit"); 
    ptr[1].Runs = 19902; 
    ptr[1].Wickets = 12; 
    ptr[1].MatchesPlayed = 500;

    ptr[2].JerseyNo = 33; 
    strcpy(ptr[2].name, "Hardik"); 
    ptr[2].Runs = 7569; 
    ptr[2].Wickets = 226; 
    ptr[2].MatchesPlayed = 159;

    ptr[3].JerseyNo = 99; 
    strcpy(ptr[3].name, "Jasprit"); 
    ptr[3].Runs = 754; 
    ptr[3].Wickets = 594; 
    ptr[3].MatchesPlayed = 284;

    ptr[4].JerseyNo = 7; 
    strcpy(ptr[4].name, "Dhoni"); 
    ptr[4].Runs = 17266; 
    ptr[4].Wickets = 1; 
    ptr[4].MatchesPlayed = 538;

    ptr[5].JerseyNo = 10; 
    strcpy(ptr[5].name, "Sachin"); 
    ptr[5].Runs = 34357; 
    ptr[5].Wickets = 201; 
    ptr[5].MatchesPlayed = 664;

    ptr[6].JerseyNo = 12; 
    strcpy(ptr[6].name, "Yuvraj"); 
    ptr[6].Runs = 11778; 
    ptr[6].Wickets = 148; 
    ptr[6].MatchesPlayed = 402;

    *size = 7;
    printf("\nHardcoded 7 Players loaded successfully!\n");
}

void addPlayer(Player** ptr, int* size, int* capacity)
{
    if(*size == *capacity)
    {
        *capacity *= 2;
        *ptr = realloc(*ptr, (*capacity) * sizeof(Player));
        if(*ptr == NULL)
        {
            printf("Memory allocation failed!\n");
            exit(1);
        }
        printf("\nCapacity increased to %d\n", *capacity);
    }

    Player *p = *ptr + *size;

    printf("\n------------ADD PLAYER------------\n");

    printf("Enter Jersey Number: \n");
    scanf("%d", &p->JerseyNo);

    printf("Enter Name: \n");
    scanf("%s", p->name);

    printf("Enter Runs: \n");
    scanf("%d", &p->Runs);

    printf("Enter Wickets: \n");
    scanf("%d", &p->Wickets);

    printf("Enter Matches Played: \n");
    scanf("%d", &p->MatchesPlayed);

    (*size)++;
    printf("\nPlayer Added Successfully.\n");
}

void removePlayer(Player* ptr, int* size)
{
    int retry = 1;

    while(retry)
    {
        int searchChoice;
        printf("\n------ REMOVE MENU ------\n");
        printf("Press 1 to Remove by Name\n");
        printf("Press 2 to Remove by Jersey Number\n");
        printf("Enter your choice: \n");
        scanf("%d", &searchChoice);

        int index = -1;

        if(searchChoice == 1)  // Remove by Name
        {
            char name[20];
            printf("\nEnter Name to delete: \n");
            scanf("%s", name);
            index = searchPlayerByName(ptr, *size, name);
        }
        else if(searchChoice == 2)  // Remove by Jersey Number
        {
            int Jersey;
            printf("\nEnter Jersey Number to delete: \n");
            scanf("%d", &Jersey);
            index = searchPlayerByJerseyNo(ptr, *size, Jersey);
        }
        else
        {
            printf("\nInvalid Choice.\n");
            continue;
        }

        if(index != -1)
        {
            for(int i = index; i < *size - 1; i++)
            {
                ptr[i] = ptr[i + 1];
            }
            (*size)--;
            printf("\nPlayer Removed Successfully.\n");
            break;
        }
        else
        {
            int ch;
            printf("\nPlayer not found!\n");
            printf("1. Enter Again\n");
            printf("2. Go to Main Menu\n");
            printf("Enter your choice: \n");
            scanf("%d", &ch);
            if(ch == 2) break;
        }
    }
}

int searchPlayerByJerseyNo(Player* ptr, int size, int Jersey)
{
    for(int i = 0; i < size; i++)
    {
        if(ptr[i].JerseyNo == Jersey)
            return i;
    }
    return -1;
}

int searchPlayerByName(Player* ptr, int size, char name[])
{
    for(int i = 0; i < size; i++)
    {
        if(strcasecmp(ptr[i].name, name) == 0)
            return i;
    }
    return -1;
}

void updatePlayers(Player* ptr, int size)
{
    int retry = 1;

    while(retry)
    {
        int searchChoice;
        printf("\n------ UPDATE MENU ------\n");
        printf("Press 1 to Update by Name\n");
        printf("Press 2 to Update by Jersey Number\n");
        printf("Enter your choice: \n");
        scanf("%d", &searchChoice);

        int index = -1;

        if(searchChoice == 1)  // Update by Name
        {
            char name[20];
            printf("\nEnter Name to update: \n");
            scanf("%s", name);
            index = searchPlayerByName(ptr, size, name);
        }
        else if(searchChoice == 2)  // Update by Jersey Number
        {
            int Jersey;
            printf("\nEnter Jersey Number to update: \n");
            scanf("%d", &Jersey);
            index = searchPlayerByJerseyNo(ptr, size, Jersey);
        }
        else
        {
            printf("\nInvalid Choice.\n");
            continue;
        }

        if(index != -1)
        {
            printf("\n------------UPDATE PLAYER------------\n");

            printf("New Runs: \n");
            scanf("%d", &ptr[index].Runs);

            printf("New Wickets: \n");
            scanf("%d", &ptr[index].Wickets);

            printf("New Matches Played: \n");
            scanf("%d", &ptr[index].MatchesPlayed);

            printf("\nRecord updated successfully.\n");
            break;
        }
        else
        {
            int ch;
            printf("\nPlayer not found!\n");
            printf("1. Enter Again\n");
            printf("2. Go to Main Menu\n");
            printf("Enter your choice: \n");
            scanf("%d", &ch);
            if(ch == 2) break;
        }
    }
}

void sortedPlayers(Player* ptr, int size)
{
    if(size == 0)
    {
        printf("\nNo players to sort.\n");
        return;
    }

    int choice;
    printf("\n----------SORT OPTIONS----------\n");
    printf("Press 1 to sort by Max Runs: \n");
    printf("Press 2 to sort by Min Runs: \n");
    printf("Press 3 to sort by Max Wickets: \n");
    printf("Press 4 to sort by Min Wickets: \n");
    printf("Enter Choice: \n");
    scanf("%d", &choice);

    Player temp;
    for(int i = 0; i < size - 1; i++)
    {
        for(int j = i + 1; j < size; j++)
        {
            int swap = 0;

            if(choice == 1 && ptr[j].Runs > ptr[i].Runs) swap = 1;
            else if(choice == 2 && ptr[j].Runs < ptr[i].Runs) swap = 1;
            else if(choice == 3 && ptr[j].Wickets > ptr[i].Wickets) swap = 1;
            else if(choice == 4 && ptr[j].Wickets < ptr[i].Wickets) swap = 1;

            if(swap)
            {
                temp = ptr[i];
                ptr[i] = ptr[j];
                ptr[j] = temp;
            }
        }
    }

    printf("\nSorted Players.\n");
    displayPlayers(ptr, size);
}

void displayPlayers(Player* ptr, int size)
{
    if(size == 0)
    {
        printf("\nNo Players to display.\n");
        return;
    }

    printf("\n============================================================================\n");
    printf("| %-10s | %-15s | %-10s | %-10s | %-15s |\n", "Jersey No", "Name", "Runs", "Wickets", "Matches Played");
    printf("--------------------------------------------------------------------------\n");

    for(int i = 0; i < size; i++)
    {
        printf("| %-10d | %-15s | %-10d | %-10d | %-15d |\n",
               ptr[i].JerseyNo, ptr[i].name, ptr[i].Runs, ptr[i].Wickets, ptr[i].MatchesPlayed);
    }

    printf("============================================================================\n\n");
}

void topRunsWickets(Player* ptr, int size)
{
    if(size == 0)
    {
        printf("\nNo player available.\n");
        return;
    }

    int choice;
    printf("Press 1 for Top 3 Highest Run Scorers.\n");
    printf("Press 2 for Top 3 Highest Wicket Takers.\n");
    printf("Enter your choice: \n");
    scanf("%d", &choice);

    Player temp[size];
    for(int i = 0; i < size; i++)
    {
        temp[i] = ptr[i];
    }

    for(int i = 0; i < size - 1; i++)
    {
        for(int j = i + 1; j < size; j++)
        {
            if((choice == 1 && temp[j].Runs > temp[i].Runs) || (choice == 2 && temp[j].Wickets > temp[i].Wickets))
            {
                Player t = temp[i];
                temp[i] = temp[j];
                temp[j] = t;
            }
        }
    }

    if(choice == 1)
    {
        printf("\n===================== TOP 3 RUN SCORERS =====================\n");
        printf("| %-10s | %-15s | %-10s |\n", "Jersey No", "Name", "Runs");
    }
    else if(choice == 2)
    {
        printf("\n===================== TOP 3 WICKET TAKERS ====================\n");
        printf("| %-10s | %-15s | %-10s |\n", "Jersey No", "Name", "Wickets");
    }
    else
    {
        printf("\nInvalid Choice.\n");
        return;
    }

    printf("--------------------------------------------------------------\n");
    int top = size < 3 ? size : 3;

    for(int i = 0; i < top; i++)
    {
        printf("| %-10d | %-15s | %-10d |\n",
               temp[i].JerseyNo, temp[i].name, choice == 1 ? temp[i].Runs : temp[i].Wickets);
    }

    printf("==============================================================\n\n");
}
