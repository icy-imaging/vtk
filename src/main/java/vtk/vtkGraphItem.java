// java wrapper for vtkGraphItem object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGraphItem extends vtkContextItem
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

  private native void SetGraph_4(vtkGraph id0);
  public void SetGraph(vtkGraph id0)
  {
    SetGraph_4(id0);
  }

  private native long GetGraph_5();
  public vtkGraph GetGraph()
  {
    long temp = GetGraph_5();

    if (temp == 0) return null;
    return (vtkGraph)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetLayout_6();
  public vtkIncrementalForceLayout GetLayout()
  {
    long temp = GetLayout_6();

    if (temp == 0) return null;
    return (vtkIncrementalForceLayout)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void StartLayoutAnimation_7(vtkRenderWindowInteractor id0);
  public void StartLayoutAnimation(vtkRenderWindowInteractor id0)
  {
    StartLayoutAnimation_7(id0);
  }

  private native void StopLayoutAnimation_8();
  public void StopLayoutAnimation()
  {
    StopLayoutAnimation_8();
  }

  private native void UpdateLayout_9();
  public void UpdateLayout()
  {
    UpdateLayout_9();
  }

  public vtkGraphItem() { super(); }

  public vtkGraphItem(long id) { super(id); }
  public native long   VTKInit();

}
