package kr.co.wikibook.gallery.common.util;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.extern.log4j.Log4j2;

import java.util.Enumeration;


@Log4j2
public class HttpUtils {

    // 세션입력
    // 로그인 실행 시 호출
    // String key = 'memberId', Object value = 1,2,3 등등
    public static void setSession(HttpServletRequest req, String key, Object value) {
//        String jsessionIdLogin = req.getSession().getId();
//        System.out.println("서버가 인식한 JSESSIONIDLOGIN: " + jsessionIdLogin);

        // req.getSession() 현재 요청에 이미 세션이 있으면 그대로 반환
        req.getSession().setAttribute(key, value);
    }

    // 세션 값 조회
    public static Object getSessionValue(HttpServletRequest req, String key) {
        //System.out.println("세션값조회 req: " + req + " 세션값조회 key: " + key);
        //System.out.println("세션값조회 req.getSession().getAttribute(key): " + req.getSession().getAttribute(key));
        //System.out.println("로그인 여부 체크 req.getSession(false): " + req.getSession(false));
        String jsessionId = req.getSession().getId();
        System.out.println("서버가 인식한 JSESSIONID: " + jsessionId);
        //System.out.println("로그인 여부 확인 할 때 세션저장소: " + req.getSession(false).getAttributeNames());
        HttpSession session = req.getSession(false);
        if (session != null) {
            System.out.println("세션 ID: " + session.getId());
            Enumeration<String> names = session.getAttributeNames();
            while (names.hasMoreElements()) {
                String name = names.nextElement();
                Object value = session.getAttribute(name);
                System.out.println("세션 속성: " + name + " = " + value);
            }
        }

        return req.getSession().getAttribute(key);
    }


    // 세션삭제 (교재내용)
    public static void removeSession(HttpServletRequest req, String key) {
        req.getSession().removeAttribute(key);
        System.out.println("로그아웃 이후 세션저장소: " + req.getSession(false).getAttributeNames());
    }
    // 세션삭제 (교재와 다르게 구현)
//    public static void removeSession(HttpServletRequest req, String key) {
//        HttpSession session = req.getSession(false); // 기존 세션 가져오기
//        if (session != null) {
//            session.invalidate(); // 세션 전체 무효화
//        }
//    }
}
