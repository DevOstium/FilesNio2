package nio2.notificar;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class NotificarSeHouveMudancaNoArquivo {

	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException, InterruptedException {
		
		Path diretorio = Paths.get("C:\\temp");
		
		WatchService watcher = FileSystems.getDefault().newWatchService();
		
		diretorio.register(  watcher, 
				             StandardWatchEventKinds.ENTRY_CREATE,
				             StandardWatchEventKinds.ENTRY_MODIFY,
				             StandardWatchEventKinds.ENTRY_DELETE
				         );
		
		while(true) {
			
			// Importante colocar em uma thread a parte para nao bloquear o fluxo da execucao
			WatchKey key = watcher.take();
			
				for( WatchEvent<?> event : key.pollEvents() ) {
					Kind<?> kind = event.kind();
					
					if( kind == StandardWatchEventKinds.OVERFLOW) {
						continue;
					}
					
					WatchEvent<Path> watchEvent = (WatchEvent<Path>) event;
					Path fileName = watchEvent.context();
					
					System.out.println(" Event : " + kind + " ; File : " + fileName);
					
					if(!key.reset()) {
						break;
					}
					
				} // end for
		} // end while
		
		
		
	}
}
