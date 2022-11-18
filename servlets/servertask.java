package com.jspiders.servlets.servletclass;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servertask extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException  , IOException{
		
		resp.setContentType("text/html");
		PrintWriter write = resp.getWriter();
//		resp.setHeader("refresh", "1");
		Date date = new Date();
		write.println("<h1>Sushant Singh Rajput</h1>\r\n"
				+ "    <hr />\r\n"
				+ "    <h3> home page <a href=\"./index2.html\" target=\"_blank\"> <br> Additional Info</a><br><a href=\"./index3.html\" target=\"_blank\">Movies</a><br><a href=\"./index4.html\" target=\"_blank\">Images</a></h3>\r\n"
				+ "    <p> <i><u>From Wikipedia, the free encyclopedia</u></i>\r\n"
				+ "        </p>\r\n"
				+ "    <center>\r\n"
				+ "\r\n"
				+ "      <h3> <mark> Sushant Singh Rajput </mark> </h3>\r\n"
				+ "      <p>Rajput in 2016</p>\r\n"
				+ "<img\r\n"
				+ "        src=\"/servlets1/image/Planet9_3840x2160.jpg"
				+ "        alt=\"sushant singh\"\r\n"
				+ "        height=\"400\"\r\n"
				+ "        width=\"300\"\r\n"
				+ "      />"
				+ "      <table >\r\n"
				+ "        <tr>\r\n"
				+ "          <td><b> Born </b></td>\r\n"
				+ "          <td style=\"text-align: center\">\r\n"
				+ "            21 January 1986 <br>\r\n"
				+ "            Patna, Bihar, India\r\n"
				+ "          </td>\r\n"
				+ "        </tr>\r\n"
				+ "        <tr>\r\n"
				+ "          <td><b>Died</b></td>\r\n"
				+ "          <td style=\"text-align: center\">\r\n"
				+ "            14 June 2020 <br>\r\n"
				+ "            (aged 34) Mumbai, Maharashtra, India\r\n"
				+ "          </td>\r\n"
				+ "        </tr>\r\n"
				+ "        <tr>\r\n"
				+ "            <td><b>Cause of death</b></td>\r\n"
				+ "            <td style=\"text-align: center;\">Suicide by hanging</td>\r\n"
				+ "        </tr>\r\n"
				+ "        <tr>\r\n"
				+ "            <td><b>Occupation</b></td>\r\n"
				+ "            <td style=\"text-align: center;\">Actor</td>\r\n"
				+ "        </tr>\r\n"
				+ "        <tr>\r\n"
				+ "            <td><b>Years active</b></td>\r\n"
				+ "            <td style=\"text-align: center;\"> 1996-2020</td></td>\r\n"
				+ "        </tr>\r\n"
				+ "        <tr>\r\n"
				+ "            <td><b>Signature</b> </td>\r\n"
				+ "            <td  style=\"text-align: center;\" >\r\n"
				+ "                <img src=\"./images/Sushant_Singh_Rajput_Signature.svg\" alt=\"signature\" height=\"50\" width=\"100\">\r\n"
				+ "            </td>\r\n"
				+ "        </tr>\r\n"
				+ "      </table>\r\n"
				+ "      </center>\r\n"
				+ "      <br>\r\n"
				+ "      <p> <b>Sushant Singh Rajput</b> (21 January 1986 – 14 June 2020) was an Indian actor known for his work in <a href=\"https://en.wikipedia.org/wiki/Hindi_cinema\" target=\"_blank\">Hindi cinema</a> . He starred in a number of commercially successful Bollywood films such as <a href=\"https://en.wikipedia.org/wiki/M.S._Dhoni:_The_Untold_Story\" >M.S. Dhoni: The Untold Story</a>  (2016), <a href=\"https://en.wikipedia.org/wiki/Kedarnath_(film)\" target=\"_blank\">Kedarnath</a>  (2018) and <a href=\"https://en.wikipedia.org/wiki/Chhichhore\" target=\"_blank\">Chhichhore</a>  (2019). Due to his contribution to the film industry, he received a <a href=\"https://en.wikipedia.org/wiki/Screen_Awards\">Screen Award</a> and was nominated for the <a href=\"https://en.wikipedia.org/wiki/Filmfare_Awards\">Filmfare Awards</a> on three occasions. He appeared on Forbes India's <a href=\"https://en.wikipedia.org/wiki/Forbes_Celebrity_100\">Celebrity 100</a>  list twice since 2017. <br>\r\n"
				+ "\r\n"
				+ "        Rajput started his career after dropping out of his engineering course at the <a href=\"https://en.wikipedia.org/wiki/Delhi_Technological_University\">Delhi College of Engineering</a>  and entering the theatre industry in <a href=\"https://en.wikipedia.org/wiki/Mumbai\"> Mumbai</a>. He moved on to feature in Hindi television serials, his debut show was the romantic drama <a href=\"https://en.wikipedia.org/wiki/Kis_Desh_Mein_Hai_Meraa_Dil\">Kis Desh Mein Hai Meraa Dil</a>  (2008), followed by the lead role in the soap opera <a href=\"https://en.wikipedia.org/wiki/Pavitra_Rishta\">Pavitra Rishta</a> (2009–2011). He made his Bollywood debut in the film adaptation <a href=\"https://en.wikipedia.org/wiki/Kai_Po_Che!\"> Kai Po Che!</a> (2013) which became a commercial and critical success. Followed by his starring role in the romantic comedy <a href=\"https://en.wikipedia.org/wiki/Shuddh_Desi_Romance\">Shuddh Desi Romance</a> (2013) and the role of the titular detective in the action thriller <a href=\"https://en.wikipedia.org/wiki/Detective_Byomkesh_Bakshy!\">Detective Byomkesh Bakshy!</a>  (2015). <br>\r\n"
				+ "        \r\n"
				+ "        He also starred in a number of other films such as the reincarnation drama <a href=\"https://en.wikipedia.org/wiki/Raabta_(film)\">Raabta</a> (2017), the historical drama <a href=\"https://en.wikipedia.org/wiki/Sonchiriya\">Sonchiriya</a>  (2019) and the action thriller <a href=\"https://en.wikipedia.org/wiki/Drive_(2019_film)\">Drive</a> (2019). His highest-grossing releases came with a supporting role in the satire PK (2014), and from the titular role in the sports biopic of <a href=\"https://en.wikipedia.org/wiki/Drive_(2019_film)\">Mahendra Singh Dhoni</a> . For his performance in the latter, he received his first nomination for the <a href=\"https://en.wikipedia.org/wiki/Filmfare_Award_for_Best_Actor\">Filmfare Award for Best Actor</a>  and became the winning nomination at the Indian Film Festival of Melbourne. Apart from acting, he was the founder of a nonprofit organisation and has been credited as the co-founder of a technological startup.\r\n"
				+ "        \r\n"
				+ "        Rajput died by suicide at his home in <a href=\"https://en.wikipedia.org/wiki/Bandra\" target=\"_blank\"> Bandra, Mumbai</a> in June 2020, aged 34.His last film, Dil Bechara (2020), was released posthumously on the streaming platform <a href=\"https://en.wikipedia.org/wiki/Disney%2B_Hotstar\" target=\"_blank\">Hotstar</a> .</p>\r\n"
				+ "  \r\n"
				+ "        <br>\r\n"
				+ "       \r\n"
				+ "        <hr><br>");
	}
	
}
