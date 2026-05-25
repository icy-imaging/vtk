// java wrapper for vtkCirclePackLayout object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCirclePackLayout extends vtkTreeAlgorithm
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

  private native byte[] GetCirclesFieldName_4();
  public String GetCirclesFieldName()
  {
    return new String(GetCirclesFieldName_4(), StandardCharsets.UTF_8);
  }

  private native void SetCirclesFieldName_5(byte[] id0, int len0);
  public void SetCirclesFieldName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetCirclesFieldName_5(bytes0, bytes0.length);
  }

  private native void SetSizeArrayName_6(byte[] id0, int len0);
  public void SetSizeArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetSizeArrayName_6(bytes0, bytes0.length);
  }

  private native long GetLayoutStrategy_7();
  public vtkCirclePackLayoutStrategy GetLayoutStrategy()
  {
    long temp = GetLayoutStrategy_7();

    if (temp == 0) return null;
    return (vtkCirclePackLayoutStrategy)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLayoutStrategy_8(vtkCirclePackLayoutStrategy id0);
  public void SetLayoutStrategy(vtkCirclePackLayoutStrategy id0)
  {
    SetLayoutStrategy_8(id0);
  }

  private native long GetMTime_9();
  public long GetMTime()
  {
    return GetMTime_9();
  }

  public vtkCirclePackLayout() { super(); }

  public vtkCirclePackLayout(long id) { super(id); }
  public native long   VTKInit();

}
