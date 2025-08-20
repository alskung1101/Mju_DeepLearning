package Permission;

import API.KakaoApi;
import DTO.ExpenseItemDTO;
import DTO.IncomeItemDTO;
import DTO.ScheduleDTO;
import Entity.Schedule;
import Entity.Staff;
import Entity.Worker;
import java.util.List;


public interface Permission {
    Long restaurantId = null;
    int PERMISSION_LEVEL = Integer.parseInt(null);
    KakaoApi kakaoApi = null;

    default void addBonus(String content, int bonus, Worker worker){
        //접근권한이 없다는 안내
    };
    default void calWorkersSalary(){
        //접근권한이 없다는 안내
    };
    default void setPermission(Staff staff, int level){
        //접근권한이 없다는 안내
    };
    default List<Schedule> filterObjectionToPermission(int level){
        //접근권한이 없다는 안내
        return null;
    };
    default Schedule fixObjection(boolean change, Worker maneger, Long scheduleId){
        //접근권한이 없다는 안내
        return null;
    };
    default void createSchedule(ScheduleDTO dto, Worker Maneger){
        //접근권한이 없다는 안내
    };
    default void changeSchedule(Schedule schedule){
        //접근권한이 없다는 안내
    };
    default void registerExpense(ExpenseItemDTO expense){
        //접근권한이 없다는 안내
    };
    default List<ExpenseItemDTO> getAllExpenses(){
        //접근권한이 없다는 안내
        return null;
    };
    default void deleteExpense(int index){
        //접근권한이 없다는 안내
    };
    default void updateExpense(int index, ExpenseItemDTO updatedExpense){
        //접근권한이 없다는 안내
    };
    default void registerIncome(IncomeItemDTO income){
        //접근권한이 없다는 안내
    };
    default List<IncomeItemDTO> getAllIncomes(){
        //접근권한이 없다는 안내
        return null;
    };
    default void deleteIncome(int index){
        //접근권한이 없다는 안내
    };
    default void updateIncome(int index, IncomeItemDTO updatedIncome){
        //접근권한이 없다는 안내
    };
    default void compareTotalIncome(int previousIncome){
        //접근권한이 없다는 안내
    };
    default void addStock(String stockName, String category){
        //접근권한이 없다는 안내
    };
    default void reviseStock(String stockName, String category){
        //접근권한이 없다는 안내
    };
    default String getStock(){
        //접근권한이 없다는 안내
        return "";
    };
    default void setExpirationDate(String date){
        //접근권한이 없다는 안내
    };
    default String getExpirationDate(){
        //접근권한이 없다는 안내
        return "";
    };
    default void setCategory(String category){
        //접근권한이 없다는 안내
    };
    default String getCategory(){
        //접근권한이 없다는 안내
        return "";
    };
    default void sortByExpirationDate(String date){
        //접근권한이 없다는 안내
    };
    default void deleteStock(String stockName, String category){
        //접근권한이 없다는 안내
    };
    default boolean selectItem(){
        //접근권한이 없다는 안내
        return false;
    };
    default void addItemStock(String stockName, String category){
        //접근권한이 없다는 안내
    };
    default void reviseItemStock(String stockName, String category){
        //접근권한이 없다는 안내
    };
    default void getItemStock(){
        //접근권한이 없다는 안내
    };
    default void setItemCategory(String category){
        //접근권한이 없다는 안내
    };
    default void sortByUsagePeriod(String period){
        //접근권한이 없다는 안내
    };
    default void deleteItemStock(String stockName, String category){
        //접근권한이 없다는 안내
    };
    default void invite(String phone){
        //접근권한이 없다는 안내
    };
    default void closure(){
        //접근권한이 없다는 안내
    };

}
