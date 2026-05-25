// java wrapper for vtkCirclePackFrontChainLayoutStrategy object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCirclePackFrontChainLayoutStrategy extends vtkCirclePackLayoutStrategy
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

  private native void Layout_4(vtkTree id0,vtkDataArray id1,vtkDataArray id2);
  public void Layout(vtkTree id0,vtkDataArray id1,vtkDataArray id2)
  {
    Layout_4(id0,id1,id2);
  }

  private native int GetWidth_5();
  public int GetWidth()
  {
    return GetWidth_5();
  }

  private native void SetWidth_6(int id0);
  public void SetWidth(int id0)
  {
    SetWidth_6(id0);
  }

  private native int GetHeight_7();
  public int GetHeight()
  {
    return GetHeight_7();
  }

  private native void SetHeight_8(int id0);
  public void SetHeight(int id0)
  {
    SetHeight_8(id0);
  }

  public vtkCirclePackFrontChainLayoutStrategy() { super(); }

  public vtkCirclePackFrontChainLayoutStrategy(long id) { super(id); }
  public native long   VTKInit();

}
