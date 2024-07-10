package pro.sky.petpartnersbot.service.impl;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pro.sky.petpartnersbot.entity.Message;
import pro.sky.petpartnersbot.repository.MessageRepository;
import pro.sky.petpartnersbot.service.MessageService;

@Service
@RequiredArgsConstructor
public class MessageServiceImpl implements MessageService {
    private final Logger logger = LoggerFactory.getLogger(MessageServiceImpl.class);
    private final MessageRepository repository;
    @Override
    public Message findByType(String type) {
        logger.info("Was invoked find Message by Type method");
        return repository.findByType(type);
    }
}
