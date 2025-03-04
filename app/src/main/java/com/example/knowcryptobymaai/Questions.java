package com.example.knowcryptobymaai;

public class Questions {
    public String[] mQuestion = {
            "1. ใครมีหน้าที่ยื่นแบบภาษีเงินได้จากคริปโตเคอร์เรนซี ?",
            "2. เหรียญชิบะ อินุ มีชื่่อสัญลักษณ์ว่าอะไร ?",
            "3. ชื่อเหรียญ Binance USD มีสัญลักษณ์คือ? ",
            "4. เหรียญอะไรที่มีค่าเงินสูงที่สุดในบรรดาเหรียญ คริปโต  ?",
            "5. ในแอปของ BIT KUB ในการเทรดเหรียญจะเสียค่าธรรมเนียมแต่ละครั้งกี่เปอเซ็น?",
            "6. ในแอปของ Binance ในการเทรดเหรียญจะเสียค่าธรรมเนียมแต่ละครั้งกี่เปอเซ็น?",
            "7. ในการเทรดเหรียญจะภาษีมูลค่าเพิ่มท่าไหร่?",
            "8. ในการเทรดเหรียญจะภาษีเงินได้ท่าไหร่?",
            "9. Balance report คืออะไร?",
            "10. เครดิตค่าธรรมเนียมคืออะไร ?"
    };
    public String[][] mChoices ={
            {"1.คนที่ได้เงินจากการโอนหรือขายคริปโตเคอร์เรนซี","แม่ค้าขายปลา","พนักงานบัญชี","คนขุดแร่"},
            {"1.USDT","2.SHIBA INU",".3.DOT","4.SAND BOX"},
            {"1.USDT","2.USDC.","3.BTC","4.BUSD"},
            {"ฺ1.BTC.","2.SAND BOX","3.ETC","4.BUSD"},
            {"1. 0.1 %","2. 0.25 %","3. 0.2 %","4.0.15 %" },
            {"1. 0.1 %","2. 0.25 %","3. 0.2 %","4.0.15 %" },
            {"1. 5 %","2. 2 %","3. 3 %","4.7 %" },
            {"1. 10-15 %","2. 15-17 %","3. 12-15 %","4. 15-17 %" },
            {"1. การแจ้งปัญหา Balance ","2. การตรวจสอบกระเป๋าปลายทางและเครือข่ายที่รองรับรายการเอกสารแสดงความเป็นเจ้าของหมายเลขโทรศัพท์ ","3.การยืนยันตัวตนใน Balance ","4. การเสียภาษี" },
            {"1. โปรโมชั่นพิเศษจากแอปเทรด ที่จะมอบเครดิตพิเศษตามเงื่อนไขในช่วงเวลาที่กำหนดเท่านั้น เช่น ลูกค้าที่แนะนำเพื่อนให้มาเทรดกับบิทคับ ","2. การตรวจสอบกระเป๋าปลายทางและเครือข่ายที่รองรับรายการเอกสารแสดงความเป็นเจ้าของหมายเลขโทรศัพท์ ","3.กระเป๋าเงินในแอป ","4. การเสียภาษี" }
    };
    public String[] mCorrectAnswer=
            {"1.คนที่ได้เงินจากการโอนหรือขายคริปโตเคอร์เรนซี","2.SHIBA INU","4.BUSD","1.BTC","2. 0.25","1. 0.1 %","4.7 %","1. 10-15","2. การตรวจสอบกระเป๋าปลายทางและเครือข่ายที่รองรับรายการเอกสารแสดงความเป็นเจ้าของหมายเลขโทรศัพท์","1. โปรโมชั่นพิเศษจากแอปเทรด ที่จะมอบเครดิตพิเศษตามเงื่อนไขในช่วงเวลาที่กำหนดเท่านั้น เช่น ลูกค้าที่แนะนำเพื่อนให้มาเทรดกับบิทคับ"};
    public String getQuestion(int a){
        String question = mQuestion[a];
        return question;
    }
    public String getChoice1(int a){
        String choice = mChoices[a][0];
        return choice;
    }
    public String getChoice2(int a){
        String choice = mChoices[a][1];
        return choice;
    }
    public String getChoice3(int a){
        String choice = mChoices[a][2];
        return choice;
    }
    public String getChoice4(int a){
        String choice = mChoices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswer[a];
        return answer;
    }
}
