import java.util.List;

public class Folder implements FileItem {
   private List<FileItem> items; // We need to fill this with the contents of the Folder
   
   public int fileCount ( ) {
      int count = 1;

      for (FileItem item : items)
        count += item.fileCount ( );

      return count;
   }
   
   public int totalSize() {
     return 1;
   }
  
}
