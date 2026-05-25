// java wrapper for vtkPolyDataItem object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPolyDataItem extends vtkContextItem
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

  private native boolean Paint_4(vtkContext2D id0);
  public boolean Paint(vtkContext2D id0)
  {
    return Paint_4(id0);
  }

  private native void SetPolyData_5(vtkPolyData id0);
  public void SetPolyData(vtkPolyData id0)
  {
    SetPolyData_5(id0);
  }

  private native void SetMappedColors_6(vtkUnsignedCharArray id0);
  public void SetMappedColors(vtkUnsignedCharArray id0)
  {
    SetMappedColors_6(id0);
  }

  private native long GetPolyData_7();
  public vtkPolyData GetPolyData()
  {
    long temp = GetPolyData_7();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPosition_8(float id0,float id1);
  public void SetPosition(float id0,float id1)
  {
    SetPosition_8(id0,id1);
  }

  private native void SetPosition_9(float id0[]);
  public void SetPosition(float id0[])
  {
    SetPosition_9(id0);
  }

  private native void SetScalarMode_10(int id0);
  public void SetScalarMode(int id0)
  {
    SetScalarMode_10(id0);
  }

  public vtkPolyDataItem() { super(); }

  public vtkPolyDataItem(long id) { super(id); }
  public native long   VTKInit();

}
