import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.net.ServerSocket;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.ResponseInfo;
import java.nio.file.Files;
import java.security.KeyStore.PrivateKeyEntry;
import java.sql.Time;
import java.time.Clock;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.HexFormat;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Observable;
import java.util.Optional;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Flow;
import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.crypto.SecretKey;
import javax.security.auth.kerberos.EncryptionKey;
import javax.swing.RowFilter.Entry;
import javax.xml.stream.events.EntityReference;

  class Employee {
  private int emp_id;
  private int emp_age;
  private String emp_name;
  private String emp_loc;


  //private static Employee emp;

  Employee(int emp_id, int emp_age, String emp_name, String emp_loc) {
    this.emp_age = emp_age;
    this.emp_id = emp_id;
    this.emp_name = emp_name;
    this.emp_loc = emp_loc;
  }

  // private Employee()
  // {

  // }

  // public static Employee getInstance()
  // {

  //   if(emp==null)
  //   {
  //     emp=new Employee();
  //   }

  //   return emp;
  // }

  public int getId() {
    return this.emp_id;
  }

  public int getAge() {
    return this.emp_age;
  }

  public String getName() {
    return this.emp_name;
  }

  public String getLoc() {
    return this.emp_loc;
  }

  @Override
  public String toString() {
    return "Employee [emp_id=" + emp_id + ", emp_age=" + emp_age + ", emp_name=" + emp_name + ", emp_loc=" + emp_loc
        + "]";
  }
  
  
}

// class EmployeeSearch {
//   List<Employee> employeeList;


//   EmployeeSearch(List<Employee> empList) {
//     this.employeeList = empList;
//   }

//   public Employee searchByID(int id) {
  
//     return employeeList.stream().filter((emp) -> emp.getId() == id).findAny().get();
//   }

//   public Employee searchByAge(int age) {
    
//     return employeeList.stream().filter((emp) -> emp.getAge() == age).findAny().get();
//   }

//   public Employee searchByName(String name) {
//     return employeeList.stream().filter((emp) -> emp.getName() == name).findAny().get();
//   }

//   public Employee searchByLoc(String loc) {
//     return employeeList.stream().filter((emp) -> emp.getLoc() == loc).findAny().get();
//   }
// }

class Samplecollections {

  static void quickSort(int[] arr, int startIndex, int endIndex)  {    
    if(startIndex<endIndex)
    {
      int pivotIndex;
      pivotIndex=partition(arr,startIndex,endIndex);
      quickSort(arr, startIndex, pivotIndex-1);
      quickSort(arr, pivotIndex+1, endIndex);
    
      
    }
  }

   static int partition(int[] arr, int startIndex, int endIndex) {
    int pivotIndex=endIndex;
    int partitionIndex=startIndex-1,temp=0;
    for(int i=startIndex;i<endIndex;i++)
    {
      if(arr[i]<arr[pivotIndex])
      {
        partitionIndex++;
        temp=arr[i];
        arr[i]=arr[partitionIndex];
        arr[partitionIndex]=temp;
      }
    }
    partitionIndex++;
    temp=arr[partitionIndex];
    arr[partitionIndex]=arr[pivotIndex];
    arr[pivotIndex]=temp;
    
    return partitionIndex;
  }

  static int count=0;
  static void sum(int i)
  {
    if(i==0)
    {
      return;
    }
    int rem=i%10;
    count=count*10+rem;
    sum(i/10);
  }

  static int helper(int n,int steps)
  {
    if(n==0)
    {
      return steps;
    }
    int rem=n%10;
    if((rem&1)!=1)
    {
      return helper(n/10, steps+1);
    }
    return helper(n/10, steps);
  }

  static void compute(int i)
  {
    System.out.println(helper(i,0));
  }

  static boolean ifSorted(int [] arr,int target,int index)
  {
    
    if(index==arr.length-1)
    {
      return false;
    }
    return arr[index] == target || ifSorted(arr, target, index+1);
  }

  static int binarySearch(int[] arr,int target,int start,int end)
  {
    if(start>end)
    {
      return -1;
    }
    int mid=start+(end-start)/2;
    if(arr[mid]==target)
    {
      return mid;
    }
    if(arr[start]<=arr[mid])
    {
      if(target>=arr[start] && target<=arr[mid])
      {
        return binarySearch(arr, target, start, mid-1);
      }
      else
      {
        return binarySearch(arr, target, mid+1, end);
      }
    }
     if(target>=arr[mid] && target<=arr[end])
    {
      return binarySearch(arr, target, mid+1, end);
    }
    else
    {
      return binarySearch(arr, target, start, mid-1);
    }
  }

  static void swap(int[] arr,int a,int b)
  {
    int t=arr[a];
    arr[a]=arr[b];
    arr[b]=t;
  }
  

 // static String inputString="";
  static void subset(String in,String out)
  {
    if(out.isEmpty())
    {
      System.out.println(in+" ");
      return ;
    }
  
    char c=out.charAt(0);
    subset(in+c, out.substring(1));
    subset(in, out.substring(1));

  }

  static void perm(String in,String out)
  {
    if(out.isEmpty())
    {
      System.out.println(in+" ");
      return ;
    }
  
    char c=out.charAt(0);
    for(int i=0;i<=in.length();i++)
    {
      String start=in.substring(0, i);
      String last=in.substring(i, in.length());
      perm(start+c+last, out.substring(1));

    }
    
  }

  


    
  public static void main(String[] args) {

    // List<Employee> employeeList = new ArrayList<>();
    // employeeList.add(new Employee(1, 45, "Jack", "VA"));
    // employeeList.add(new Employee(2, 36, "Tim", "NY"));
    // employeeList.add(new Employee(3, 24, "Sam", "CA"));
    // employeeList.add(new Employee(4, 51, "Cook", "GA"));
    // EmployeeSearch employeeSearch = new EmployeeSearch(employeeList);
    // System.out.println(employeeSearch.searchByID(2));

    //int arr[] ={37,15,16,41,11,38,12,33,20};
    
    //quickSort(arr,0,arr.length-1);
    //int [] arr={5,6,7,8,9,1,2,3,7,7};
    //System.out.println(binarySearch(arr,3,0,arr.length-1));
    // String s="abc";
    //System.out.println(helper(455540020, 0));
    // subset("", s);
    // perm("", s);
     //int [] arr={0,1,1,0,1,2,1,2,0,0,1};
    // int zeroFlag=0,oneFlag=0,twoFlag=arr.length-1;
    // while (oneFlag<=twoFlag)
    // {
    //   if(arr[oneFlag]==0)
    //   {
    //     swap(arr,zeroFlag,oneFlag);
    //     zeroFlag++;
    //     oneFlag++;
    //   }
    //   else if(arr[oneFlag]==1)
    //   {
    //     oneFlag++;
    //   }
    //   else if(arr[oneFlag]==2)
    //   {
    //     swap(arr,oneFlag,twoFlag);
    //     twoFlag--;
    //   }
    // }
    // for (int i : arr) {
    //   System.out.println(i+" ");
    // }
    

    // for (int i : arr) {
    //   System.out.print(i+" ");
    // }

    // int start=0,end=arr.length-1,mid,target=-1;
    // while (start<=end)
    // {
    //   mid=start+(end-start)/2;
    //   if(target<arr[mid])
    //   {
    //     end=mid-1;
    //   }
    //   else if(target>arr[mid])
    //   {
    //     start=mid+1;
    //   }
    //   else
    //   {
    //     System.out.println("Target Value is Found!!");
    //     return;
    //   }
    // }
    // System.out.println("Target Value is not in the Array");
    
    // int N=100;
    // boolean[] primeArray=new boolean[N+1];
    // for(int i=2;i*i<=N;i++)
    // {
    //   if(!primeArray[i])
    //   {
    //     for(int j=i*2;j<=N;j=j+i)
    //     {
    //       primeArray[j]=true;
    //     }
    //   }
    // }
    // for(int i=2;i<=N;i++)
    // {
    //   if(!primeArray[i])
    //   {
    //     System.out.print(i+" ");
    //   }
    // }

  //   List<Object> l=new ArrayList<>();
  //   l.add(10.75f);
  //   l.add(55.45f);
  //   l.add(50);
  //   l.add(100);
  //  System.out.println(l);
  //  List<Float> fl= l.stream().filter(x->x instanceof Float).map(x->(Float)x).collect(Collectors.toList());

  //  List<Integer> il= l.stream().filter(x->x instanceof Integer).map(x->(Integer)x).collect(Collectors.toList());
  //   List<Number>dl=Stream.concat(il.stream(), fl.stream()).sorted(Comparator.comparingDouble(Number::doubleValue)).collect(Collectors.toList());
  //   System.out.println(dl);
  //   String s="I am working in Remote Tiger";
  //   String[] arr=s.split(" ");
  //  String result= Arrays.stream(arr).sorted((a,b)->b.length()-a.length()).skip(1).findFirst().get();
  //  System.out.println(result);
     
    String str="fQgHkSvLW";
    String lowerCase=str.chars().filter(Character::isLowerCase).sorted().mapToObj(c->Character.toString(c)).collect(Collectors.joining());
    String upperCase=str.chars().filter(Character::isUpperCase).sorted().mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining());
    System.out.println(lowerCase);
    System.out.println(upperCase);
    System.out.println(str);
    StringBuilder r=new StringBuilder();
    int l=0,u=0;
    for(int i=0;i<str.length();i++)
    {
      char c=str.charAt(i);
      if(Character.isLowerCase(c))
      {
        char lower=lowerCase.charAt(l);
        r.append(lower);
        l++;
      }
      else
      {
        char upper=upperCase.charAt(u);
        r.append(upper);
        u++;
      }
    }

    System.out.println(r);

    List<Integer> ll=List.of(10,20,30,40);
    System.out.println(ll);

    String sl="hello";
    Consumer<String> cl=(s)->{
      System.out.println(s);
    };
    cl.accept(sl);

    Supplier<String> pl=()->{
      return String.valueOf(10);
    };
    System.out.println(pl.get());
  }
  

}






