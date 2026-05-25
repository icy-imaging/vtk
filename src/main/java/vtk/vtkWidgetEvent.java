// java wrapper for vtkWidgetEvent object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkWidgetEvent extends vtkObject
{

  private native int IsTypeOf_0(byte[] id0, int len0);
  public int IsTypeOf(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsTypeOf_0(bytes0, bytes0.length);
  }

  private native int IsA_1(byte[] id0, int len0);
  public int IsA(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsA_1(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBaseType_2(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBaseType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBaseType_2(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBase_3(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBase(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBase_3(bytes0, bytes0.length);
  }

  private native byte[] GetStringFromEventId_4(long id0);
  public String GetStringFromEventId(long id0)
  {
    return new String(GetStringFromEventId_4(id0), StandardCharsets.UTF_8);
  }

  private native long GetEventIdFromString_5(byte[] id0, int len0);
  public long GetEventIdFromString(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetEventIdFromString_5(bytes0, bytes0.length);
  }

  public vtkWidgetEvent() { super(); }

  public vtkWidgetEvent(long id) { super(id); }
  public native long   VTKInit();

}
