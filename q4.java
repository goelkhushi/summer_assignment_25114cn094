package day26;
import java.util.*;

    class Question{
        String question;
        String[] options;
        int correctans;
        public Question(String question,String[] options,int correctans){
            this.question = question;
            this.options = options;
            this.correctans = correctans;
        }

    }
    class Quiz{
        ArrayList<Question> question;
        int correctans=0;
        int wrongans =0;
        int score =0;
        public Quiz(){
            question =new ArrayList<>();
        }
        public void addQuestion(String question,String[] options,int correctans){
            Question q = new Question(question,options,correctans);
            this.question.add(q);
        }
        public void startQuiz(){
            Scanner sc = new Scanner(System.in);
            System.out.println("////WELOCOME IN THE QUIZ/////");
            int queno =1;
            for(Question q:question){
                System.out.println("Question number"+queno);
                System.out.println(q.question);
                for(int i=0;i<q.options.length;i++){
                    System.out.println( +i+1+" :"+q.options[i]);
                }
                System.out.println("Enter an answer(1-4)");
                int ans = sc.nextInt();
                if(ans == q.correctans){
                    System.out.println("YOUR ANSWER IS COORECT✅");
                    score+=10;
                    correctans++;
                }
                else{
                    System.out.println("YOUR ANSWER IS WRONG😑");
                    wrongans++;
                }
                queno++;
            }
            System.out.println("////QUIZ FINISHED////");
            System.out.println("Correct answer"+correctans);
            System.out.println("Wrong answer"+wrongans);
            System.out.println("Total score"+score+"/"+question.size()*10);
            System.out.println("Overall performance");
            if(score>70){
                System.out.println("you performed well");
                System.out.println("Grade A");
            }
            else{
                System.out.println("next time perfom well");
                System.out.println("Grade B");
            }
            sc.close();
        }
    }
    public class q4{
        public static void main(String[] args){
            Quiz quiz = new Quiz();
            quiz .addQuestion("What is java",new String[]{"Programming Language",
                        "Browser",
                        "Database",
                        "Operating System"},1);
            quiz.addQuestion("Capital of India?",
                new String[]{
                        "Mumbai",
                        "Delhi",
                        "Kolkata",
                        "Chennai"
                },
                2);
            quiz.addQuestion("Which keyword is used to create an object?",
                new String[]{
                        "class",
                        "new",
                        "object",
                        "create"
                },
                2);
            quiz.addQuestion("Which loop executes at least one time?",
                new String[]{
                        "for",
                        "while",
                        "do-while",
                        "foreach"
                },
                3);
            quiz.addQuestion("Which collection stores dynamic elements?",
                new String[]{
                        "Array",
                        "ArrayList",
                        "String",
                        "Scanner"
                },
                2);
            quiz.startQuiz();
        }
    }






