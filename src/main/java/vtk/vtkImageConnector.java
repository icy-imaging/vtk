// java wrapper for vtkImageConnector object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageConnector extends vtkObject
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

  private native void RemoveAllSeeds_4();
  public void RemoveAllSeeds()
  {
    RemoveAllSeeds_4();
  }

  private native void SetConnectedValue_5(byte id0);
  public void SetConnectedValue(byte id0)
  {
    SetConnectedValue_5(id0);
  }

  private native byte GetConnectedValue_6();
  public byte GetConnectedValue()
  {
    return GetConnectedValue_6();
  }

  private native void SetUnconnectedValue_7(byte id0);
  public void SetUnconnectedValue(byte id0)
  {
    SetUnconnectedValue_7(id0);
  }

  private native byte GetUnconnectedValue_8();
  public byte GetUnconnectedValue()
  {
    return GetUnconnectedValue_8();
  }

  private native void MarkData_9(vtkImageData id0,int id1,int id2[]);
  public void MarkData(vtkImageData id0,int id1,int id2[])
  {
    MarkData_9(id0,id1,id2);
  }

  public vtkImageConnector() { super(); }

  public vtkImageConnector(long id) { super(id); }
  public native long   VTKInit();

}
