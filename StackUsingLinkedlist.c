struct node{
  int info;
  struct node* link;
}
struct node* push(struct node*);
struct node* pop(struct node*);
struct node* getsize(struct node*);
void name(/* arguments */) {
  /* code */
} display(struct node*);
void main(/* arguments */) {
  /* code */
  int c;
  while (1) {
    /* code */
  printf("1:push\n");
  printf("2:pop\n");
  printf("3:getsize\n");
  printf("4:display\n", );

  printf("___________________\n");
  printf("Enter your choice\t");
  scanf("%d\n",c);

  switch (c) {
    case 1:
      push(start);
      break;
    case 2:
        pop(start);
        break;
    case 3:
      getsize(start);
      break;
    case 4:
        display(start);
        break;
    case 5:
        exit();
    default:
        printf("Wrong Choice\n");
  }
  }
}
