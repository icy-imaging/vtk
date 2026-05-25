// java wrapper for vtkGraphEdge object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGraphEdge extends vtkObject
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

  private native void SetSource_4(long id0);
  public void SetSource(long id0)
  {
    SetSource_4(id0);
  }

  private native long GetSource_5();
  public long GetSource()
  {
    return GetSource_5();
  }

  private native void SetTarget_6(long id0);
  public void SetTarget(long id0)
  {
    SetTarget_6(id0);
  }

  private native long GetTarget_7();
  public long GetTarget()
  {
    return GetTarget_7();
  }

  private native void SetId_8(long id0);
  public void SetId(long id0)
  {
    SetId_8(id0);
  }

  private native long GetId_9();
  public long GetId()
  {
    return GetId_9();
  }

  public vtkGraphEdge() { super(); }

  public vtkGraphEdge(long id) { super(id); }
  public native long   VTKInit();

}
