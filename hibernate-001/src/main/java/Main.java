
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {
	public static void main(String[] args) {
		Employee emp = new Employee(103,"Alice");
		Configuration cfg = new Configuration().configure();
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.persist(emp);
		transaction.commit();
		System.out.println(emp);
	}
}
