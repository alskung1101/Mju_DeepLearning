package Repository;

import Entity.Graph;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Repository
public class ConcreteGraphRepository implements GraphRepository {

    private List<Graph> graphs = new ArrayList<>(); // 그래프 데이터를 저장하는 리스트

    @Override
    public List<Graph> findByIncome(double income) {
        return new ArrayList<>();
    }

    @Override
    public List<Graph> findByExpense(double expense) {
        return new ArrayList<>();
    }

    @Override
    public List<Graph> findBySales(double sales) {
        return new ArrayList<>();
    }

    @Override
    public List<Graph> getIncomeData() {
        return new ArrayList<>();
    }

    @Override
    public List<Graph> getExpenseData() {
        return new ArrayList<>();
    }

    @Override
    public List<Graph> getSalesData() {
        return new ArrayList<>();
    }
    @Override
    public List<Graph> findByDateBetween(LocalDate startDate, LocalDate endDate) {
        return new ArrayList<>();
    }
    @Override
    public <S extends Graph> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Graph> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Graph> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Graph> findAll() {
        return null;
    }

    @Override
    public Iterable<Graph> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {
    }

    @Override
    public void delete(Graph entity) {
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {
    }

    @Override
    public void deleteAll(Iterable<? extends Graph> entities) {
    }

    @Override
    public void deleteAll() {
    }
}
