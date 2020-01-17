import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Channel {
	private List<subscribers> subscribers;
	private String message;
	private boolean changed;
	private final Object MUTEX = new Object();

	public YoutubeChannel() {
		subscribers = new ArrayList<subscribers>();
	}

	@Override
	public void notifie() {
		List<subscribers> subscriber = null;
		synchronized (MUTEX) {
			if (!changed)
				return;
			subscriber = new ArrayList<>(this.subscribers);
			this.changed = false;
		}
		for (subscribers obj : subscriber) {
			obj.update();
		}
	}

	public void postmsg(String msg) {
		System.out.println("Message Posted to channel:" + msg);
		this.message = msg;
		this.changed = true;
		notifie();
	}

	@Override
	public void subscribe(subscribers obj) {
		// TODO Auto-generated method stub
		if (obj == null)
			throw new NullPointerException("Null Observer");
		synchronized (MUTEX) {
			if (!subscribers.contains(obj))
				subscribers.add(obj);
		}
	}

	@Override
	public void unsubscribe(subscribers obj) {
		synchronized (MUTEX) {
			subscribers.remove(obj);
		}

	}

	@Override
	public Object getChannelupdate(subscribers obj) {
		// TODO Auto-generated method stub
		return this.message;
	}

}
