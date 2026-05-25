// java wrapper for vtkEdgeLayoutStrategy object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkEdgeLayoutStrategy extends vtkObject
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

  private native void Initialize_5();
  public void Initialize()
  {
    Initialize_5();
  }

  private native void Layout_6();
  public void Layout()
  {
    Layout_6();
  }

  private native void SetEdgeWeightArrayName_7(byte[] id0, int len0);
  public void SetEdgeWeightArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetEdgeWeightArrayName_7(bytes0, bytes0.length);
  }

  private native byte[] GetEdgeWeightArrayName_8();
  public String GetEdgeWeightArrayName()
  {
    return new String(GetEdgeWeightArrayName_8(), StandardCharsets.UTF_8);
  }

  public vtkEdgeLayoutStrategy() { super(); }

  public vtkEdgeLayoutStrategy(long id) { super(id); }

}
