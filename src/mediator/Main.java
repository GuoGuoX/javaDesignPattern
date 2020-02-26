package mediator;
/*
* 中介模式Deme
* */
public class Main {
    public static void main(String[] args) {
        Mediator mediator = new Presider();
        Department financial = new Financial(mediator);
        Department market = new Market(mediator);
        Department development = new Development(mediator);

        development.selfAction();
        development.outAction();
        market.selfAction();
        market.outAction();

        /**
         * 打印结果：
         * ////////////苦逼的开发部开始开发啦！
         * 开发部已开发完毕，请求宣传部开始市场宣传！
         * ~~~市场部开始市场宣传布局！
         * ~~~市场部开始市场宣传布局！
         * 市场部缺少资金支持，请求资金支援！
         * ------财务部开始数钱钱啦！
         */
    }

}
