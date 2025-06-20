package nl.rabobank.mongo.repository;

import nl.rabobank.mongo.document.user.UserDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface UserRepository extends MongoRepository<UserDocument, String> {
    Optional<UserDocument> findByEmail(String email);
}