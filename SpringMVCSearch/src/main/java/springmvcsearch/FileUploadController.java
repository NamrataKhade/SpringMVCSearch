package springmvcsearch;

import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {

	@RequestMapping("/fileform")
	public String showUploadForm() {
		return "fileform";
	}

	@RequestMapping(value = "/uploadimage", method = RequestMethod.POST)
	public String fileUpload(@RequestParam("profile") CommonsMultipartFile file, HttpSession session,Model model) {
		System.out.println("File upload Handler....");

		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());

		System.out.println(file.getStorageDescription());
		
        //get byte data
		byte[] data = file.getBytes();
		// we have save this file to server......
		// String realPath =
		// session.getServletContext().getRealPath("/")+file.getOriginalFilename();

		String realPath = session.getServletContext().getRealPath("/") + "WEB-INF" + File.separator + "resources"
				+ File.separator + "images" + File.separator + file.getOriginalFilename();

		System.out.println(realPath);

		try {
			FileOutputStream fileOutputStream = new FileOutputStream(realPath);

			fileOutputStream.write(data);
			fileOutputStream.close();
			System.out.println("File Uploaded Successfully .......!!!!");
			
			model.addAttribute("msg","Uploaded successfully......!!!");
			model.addAttribute("filename", file.getOriginalFilename());
			
		} catch (Exception e) {
			System.out.println("Failed .....!!!");
			e.printStackTrace();
			model.addAttribute("msg","Uploaded error......!!!");
		}
		return "filesuccess";
	}

}
