package Quiz;
import java.util.*;

class Question {
	String questionText;
	List<String> options;
	int correctOption;
	
	public Question(String questionText,List<String> options, int correctOption) {
		this.questionText = questionText;
		this.options = options;
		this.correctOption=correctOption;
	}

}
public class QuizApp{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//create list of questions
		
		List<Question>questions = new ArrayList<>();
		questions.add(new Question("What are Java loops?" , Arrays.asList("Control Structures for repetetions", "Data storage classes","Special variables","None of the above"),1));
		questions.add(new Question("What is enhanced for-loop?",Arrays.asList("A Faster For loop","A loop for Arrays/Collectios","A while loop with extra steps","None"),2));
		questions.add(new Question("How do you handle Multiple User Inputs?",Arrays.asList("Using Multiple Scanners","Using loop and Scanner","Only using Arrays","You can't"),2));
		questions.add(new Question("How is a switch-case different from if-else?",Arrays.asList("Switch works only for certain data types","Switch is lower","if-else is always better","They are identical"),1));
		questions.add(new Question("What are collection in Java?",Arrays.asList("A group of data objects","A set of loops","A library for GUIs","An array of methods"),1));
		questions.add(new Question("What is ArrayList?",Arrays.asList("A type of loop","Resizable array implementation","A sorting algorithm","None"),2));
		questions.add(new Question("How to iterate using iterator?",Arrays.asList("Using while/for with hasNext() & next()","Directly printing","Using map()function","None"),1));
		questions.add(new Question("What is a map?",Arrays.asList("key-value pair collection","An array","A for loop","An image"),1));
		questions.add(new Question("How to sort a list?",Arrays.asList("Collections.sort()","List.sort()","Both of the above","You cant't"),3));
		questions.add(new Question("How to shuffle?",Arrays.asList("Collections.shuffle()","List.shuffle()","Random shuffle()","None"),1));
		
		//shuffle questions to make it random each time
		
		Collections.shuffle(questions);
		int score = 0;
		System.out.println("===== welcome to the Java Quiz =====");
		for(int i = 0;i<questions.size();i++) {
			Question q=questions.get(i);
			System.out.println("\nQ" + (i+1) + "." + q.questionText);
			for(int j=0;j<q.options.size();j++) {
				System.out.println((j+1) + "." + q.options.get(j));
			}
			System.out.print("Your answer (1-" + q.options.size() +"):");
			int answer;
			try {
				answer = Integer.parseInt(sc.nextLine());
			}catch(NumberFormatException e) {
				System.out.println("Invalid input! Skiping question.");
				continue;
			}
			if(answer == q.correctOption) {
				System.out.println("Correct!");
				score++;
				
			}else {
				System.out.println("Wrong! Correct answer is: " + q.correctOption);
			}
		}
		System.out.println("\n===== Quiz Over =====");
		System.out.println("Your Score: " + score + "/"+ questions.size());
		sc.close();
	}
}
