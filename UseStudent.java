package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class UseStudent {

	public static void main(String[] args) {
		
		Student stud1 = new Student(1,"Prakash","Male",'B',26);
		Student stud2 = new Student(2,"Vignesh","Male",'A',25);
		Student stud3 = new Student(3,"Suresh","Male",'B',23);
		Student stud4 = new Student(6,"Dinesh","Male",'B',26);
		Student stud5 = new Student(5,"Riya","Female",'B',26);
		Student stud6 = new Student(4,"Chitra","Female",'B',26);
		
		ArrayList<Student> studs = new ArrayList<>();
		studs.add(stud1);
		studs.add(stud2);
		studs.add(stud3);
		studs.add(stud4);
		studs.add(stud5);
		studs.add(stud6);
		
		List<Student> li = studs.stream().filter(a->a.getGender().equals("Female")).collect(Collectors.toList());
		
		
//		li.forEach(b -> System.out.println(b.getName()));
		
	List<String> st = studs.stream().map(x->x.getName()).filter(y->y.startsWith("P")).collect(Collectors.toList());
	
//	st.forEach(z -> System.out.println(z));
	
  Long count = studs.stream().filter(l->l.getGender().equals("Male")).map(m->m.getName()).count();
  
//  System.out.println(count);
  
  List<String> str = studs.stream().filter(p->p.getAge()>25).map(q->q.getName()).distinct().collect(Collectors.toList());
  
//  str.forEach(k->System.out.println(k));
  
//  List<Integer> s = studs.stream().map(t->t.getAge()).max(u-);
  
//  System.out.println(max);
  
  List<String> so = studs.stream().map(x->x.getName()).sorted().collect(Collectors.toList());
  
  System.out.println(so);
  
  List<String> rev = studs.stream().map(x->x.getName()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
  
  System.out.println(rev);
  
//  System.out.println(so.reverseOrder());
  
  System.out.println("-------------------Set------------------------");
  
  Set<String> m = studs.stream().map(o->o.getName()).filter(n->n.endsWith("h")).collect(Collectors.toSet());
  System.out.println(m);
  
//  Optional<Student> emp = studs.stream()
//		  .sorted(Comparator.comparing(Student::getAge)).distinct().limit(6).skip(1).findFirst();
  int nums[]= {22,33,45,667,22,556};
  List<Integer>max=Arrays.stream(nums).boxed().sorted((a,b)->b-a).limit(2).skip(1).collect(Collectors.toList());
		max.forEach(X->System.out.println(X)); 
		
 List<Integer> secondmax=studs.stream().map(u->u.getAge()).sorted(Comparator.reverseOrder()).distinct().limit(2).skip(1).collect(Collectors.toList());
   secondmax.forEach(y->System.out.println(y)); 		
  
 // List<Student> secondmax = studs.stream().sorted().(Comparator.comparing(Student::getAge())).limit(2).skip(1).collect(Collectors.toList());  
  
   
		 
	}
}
