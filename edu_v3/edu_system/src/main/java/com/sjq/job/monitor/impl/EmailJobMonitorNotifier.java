package com.sjq.job.monitor.impl;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.JobExecution;
import org.springframework.mail.MailException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

import com.sjq.job.monitor.JobMonitorNotifier;

/**
 * 
 * 作业监控邮件通知实现
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月6日下午3:55:16
 * @version 1.0
 */
public class EmailJobMonitorNotifier implements JobMonitorNotifier {

	// private static final Logger log = Logger.getLogger(EmailJobMonitorNotifier.class);
	private static final Logger log = LoggerFactory.getLogger(EmailJobMonitorNotifier.class);

	private MailSender mailSender;
	private SimpleMailMessage templateMessage;

	private String formatExceptionMessage(Throwable exception) {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		exception.printStackTrace(new PrintStream(baos));
		return baos.toString();
	}

	private String createMessageContent(JobExecution jobExecution) {
		List<Throwable> exceptions = jobExecution.getFailureExceptions();
		StringBuilder content = new StringBuilder();
		content.append("Job execution #");
		content.append(jobExecution.getId());
		content.append(" of job instance #");
		content.append(jobExecution.getJobInstance().getId());
		content.append(" failed with following exceptions:");
		for (Throwable exception : exceptions) {
			content.append("");
			content.append(formatExceptionMessage(exception));
		}
		return content.toString();
	}

	public void notify(JobExecution jobExecution) {
		SimpleMailMessage msg = new SimpleMailMessage(this.templateMessage);
		msg.setTo("batch-administrator@example.com");
		String content = createMessageContent(jobExecution);
		msg.setText(content);
		try {
			mailSender.send(msg);
		} catch (MailException ex) {
			log.error(ex.getMessage());
		}
	}

	public MailSender getMailSender() {
		return mailSender;
	}

	public void setMailSender(MailSender mailSender) {
		this.mailSender = mailSender;
	}

	public SimpleMailMessage getTemplateMessage() {
		return templateMessage;
	}

	public void setTemplateMessage(SimpleMailMessage templateMessage) {
		this.templateMessage = templateMessage;
	}
}
