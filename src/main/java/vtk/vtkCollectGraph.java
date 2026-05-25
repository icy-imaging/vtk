// java wrapper for vtkCollectGraph object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCollectGraph extends vtkGraphAlgorithm
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

  private native void SetController_4(vtkMultiProcessController id0);
  public void SetController(vtkMultiProcessController id0)
  {
    SetController_4(id0);
  }

  private native long GetController_5();
  public vtkMultiProcessController GetController()
  {
    long temp = GetController_5();

    if (temp == 0) return null;
    return (vtkMultiProcessController)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSocketController_6(vtkSocketController id0);
  public void SetSocketController(vtkSocketController id0)
  {
    SetSocketController_6(id0);
  }

  private native long GetSocketController_7();
  public vtkSocketController GetSocketController()
  {
    long temp = GetSocketController_7();

    if (temp == 0) return null;
    return (vtkSocketController)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPassThrough_8(int id0);
  public void SetPassThrough(int id0)
  {
    SetPassThrough_8(id0);
  }

  private native int GetPassThrough_9();
  public int GetPassThrough()
  {
    return GetPassThrough_9();
  }

  private native void PassThroughOn_10();
  public void PassThroughOn()
  {
    PassThroughOn_10();
  }

  private native void PassThroughOff_11();
  public void PassThroughOff()
  {
    PassThroughOff_11();
  }

  private native void SetOutputType_12(int id0);
  public void SetOutputType(int id0)
  {
    SetOutputType_12(id0);
  }

  private native int GetOutputType_13();
  public int GetOutputType()
  {
    return GetOutputType_13();
  }

  public vtkCollectGraph() { super(); }

  public vtkCollectGraph(long id) { super(id); }
  public native long   VTKInit();

}
