// #include <iostream>  
// #include <queue>  
// int main()  
// {  
//         std::queue<int> newqueue;  
//         int qint;  
//         std::cout << "Enter some valid integer values(press 0 to exit)";  
//         do  
//         {  
//             std::cin>> qint;  
//             newqueue.push(qint);  
//         }  
//         while (qint);  
//         std::cout<< "newqueue contains: ";  
//         while(!newqueue.empty())  
//         {  
//             std::cout <<" " <<newqueue.front();  
//             newqueue.pop();  
//         }  
//         return 0;  
// } 

#include <iostream>
#include <queue>
using namespace std;

// function prototype for display_queue utility
void display_queue(queue<string> q);

int main() {

  // create a queue of string
  queue<string> animals;

  cout << "Initial Queue: ";
  display_queue(animals);

  // push element into the queue
  animals.push("Cat");
  animals.push("Dog");
  animals.push("Fox");
  
  cout << "Queue after push: ";
  display_queue(animals);
  
  // remove element from queue
  animals.pop();
  
  cout << "Queue after pop: ";
  display_queue(animals);
  
  return 0;
}

// utility function to display queue
void display_queue(queue<string> q) {
  while(!q.empty()) {
    cout << q.front() << ", ";
    q.pop();
  }

  cout << endl;
}