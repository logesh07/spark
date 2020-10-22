/*
 * package com.starBazzar.rest.exception;
 * 
 * import org.springframework.boot.web.servlet.error.ErrorController; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.ResponseBody; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.starBazzar.rest.model.Dao.errorScenario;
 * 
 * @RestController public class IndexControllerException implements
 * ErrorController {
 * 
 * public static final String PATH = "/error";
 * 
 * @Override public String getErrorPath() { return PATH; }
 * 
 * @RequestMapping(PATH)
 * 
 * @ResponseBody public errorScenario error() { return new errorScenario(98,
 * "For all other reasons", "Sorry something went wrong"); }
 * 
 * }
 */