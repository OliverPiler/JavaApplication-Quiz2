package quiz2;
import java.util.Scanner;
public class MIS_3b {
    private String coursename;
    private int a=0,b=0,c=0,d=0,f=0;
    public MIS_3b(String coursename){
        this.coursename=coursename;
    }
    public void doGrades(){
        Scanner input=new Scanner(System.in);
        int score,temp;
        System.out.println("Input Score until Ctrl^z:");
        while(input.hasNext()){ //按ctrl+z程式可能無法停止 可改用while(!input.hasNext("#")以輸入#就停止的方式去確認程式其他部分沒有錯誤
            score=input.nextInt();
            temp=score/10;
            switch(temp){
                case 10:
                case 9: a+=1;
                        break;
                case 8: b+=1;
                        break;
                case 7: c+=1;
                        break;
                case 6: d+=1;
                        break;
                default: f+=1;
                        break;
            }
        }
    }
    public void displayGrades(){
        System.out.printf("Coursename:%s\nGrade A:%d\nGrade B:%d\nGrade C:%d\nGrade D:%d\nGrade F:%d",coursename,a,b,c,d,f);
    }
}
