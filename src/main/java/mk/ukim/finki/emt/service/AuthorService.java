package mk.ukim.finki.emt.service;

import mk.ukim.finki.emt.model.Author;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AuthorService {
    List<Author> listAuthors();
}
