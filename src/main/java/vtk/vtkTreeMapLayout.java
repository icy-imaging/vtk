// java wrapper for vtkTreeMapLayout object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTreeMapLayout extends vtkTreeAlgorithm
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

  private native byte[] GetRectanglesFieldName_4();
  public String GetRectanglesFieldName()
  {
    return new String(GetRectanglesFieldName_4(), StandardCharsets.UTF_8);
  }

  private native void SetRectanglesFieldName_5(byte[] id0, int len0);
  public void SetRectanglesFieldName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetRectanglesFieldName_5(bytes0, bytes0.length);
  }

  private native void SetSizeArrayName_6(byte[] id0, int len0);
  public void SetSizeArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetSizeArrayName_6(bytes0, bytes0.length);
  }

  private native long GetLayoutStrategy_7();
  public vtkTreeMapLayoutStrategy GetLayoutStrategy()
  {
    long temp = GetLayoutStrategy_7();

    if (temp == 0) return null;
    return (vtkTreeMapLayoutStrategy)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLayoutStrategy_8(vtkTreeMapLayoutStrategy id0);
  public void SetLayoutStrategy(vtkTreeMapLayoutStrategy id0)
  {
    SetLayoutStrategy_8(id0);
  }

  private native long GetMTime_9();
  public long GetMTime()
  {
    return GetMTime_9();
  }

  public vtkTreeMapLayout() { super(); }

  public vtkTreeMapLayout(long id) { super(id); }
  public native long   VTKInit();

}
