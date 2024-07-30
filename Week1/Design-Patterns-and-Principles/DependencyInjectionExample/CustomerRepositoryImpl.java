public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public String findCustomerById(int id) {
        // Simulate database call
        return "Customer with ID " + id;
    }
}
