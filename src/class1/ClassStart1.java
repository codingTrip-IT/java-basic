package class1;
/**
 * 문제: 학생 정보 출력 프로그램 만들기
 * 당신은 두 명의 학생 정보를 출력하는 프로그램을 작성해야 한다. 각 학생은 이름, 나이, 성적을 가지고 있다.
 * **요구 사항:**
 * 1. 2. 3. 4. 첫 번째 학생의 이름은 "학생1", 나이는 15, 성적은 90입니다.
 * 두 번째 학생의 이름은 "학생2", 나이는 16, 성적은 80입니다.
 * 각 학생의 정보를 다음과 같은 형식으로 출력해야 합니다: `
 * "이름: [이름] 나이: [나이] 성적: [성적]"`
 * 변수를 사용해서 학생 정보를 저장하고 변수를 사용해서 학생 정보를 출력해야 합니다.
 * **예시 출력:**
 * ```
 * ```
 * 이름: 학생1 나이: 15 성적: 90
 * 이름: 학생2 나이: 16 성적: 80
 * 변수를 사용해서 이 문제를 풀어보면 다음과 같다.
 * */
public class ClassStart1 {

    public static void main(String[] args) {
        String student1Name = "학생1";
        int student1Age = 15;
        int student1Grade = 90;

        String student2Name = "학생2";
        int student2Age = 16;
        int student2Grade = 80;

        System.out.println("이름:" + student1Name + " 나이:" + student1Age + " 성적:" + student1Grade);
        System.out.println("이름:" + student2Name + " 나이:" + student2Age + " 성적:" + student2Grade);
    }
}
