struct node{
  int info;
  struct node* link;
}
struct node* push(struct node*);
struct node* pop(struct node*);
int node* getsize(struct node*);
void display(struct node*);

void main(/* arguments */) {
  /* code */
  struct node* start;
  start = null;
  int c,s=0;
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

struct node* push(start){
  struct node* temp;
  temp.info=null;
  printf("Enter data\n");
  scanf("%d\n",temp.data);
  if (start==null) {
    /* code */
    start=temp;
  }
  else{
    temp.info=start;
    start=temp;
  }
  s++;
  return start;
}

struct node* pop(start){
  if (start==null) {
    /* code */
    printf("Stack is empty\n", );
  }
  else{
    printf("%d is poped\n",start.data );
    start=start.info;
    s--;
  }
  return start;
}

void getsize(start){
  printf("size is %d\n",s);
}

void  display(start) {
  /* code */
  while (p.info!=null) {
    /* code */
    printf("%d\t",p.data);
    p=p.info;
  }
}
