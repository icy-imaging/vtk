// java wrapper for vtkCellAttribute object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCellAttribute extends vtkObject
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

  private native int GetId_4();
  public int GetId()
  {
    return GetId_4();
  }

  private native void SetId_5(int id0);
  public void SetId(int id0)
  {
    SetId_5(id0);
  }

  private native int GetNumberOfComponents_6();
  public int GetNumberOfComponents()
  {
    return GetNumberOfComponents_6();
  }

  private native long GetColormap_7();
  public vtkScalarsToColors GetColormap()
  {
    long temp = GetColormap_7();

    if (temp == 0) return null;
    return (vtkScalarsToColors)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean SetColormap_8(vtkScalarsToColors id0);
  public boolean SetColormap(vtkScalarsToColors id0)
  {
    return SetColormap_8(id0);
  }

  private native void ShallowCopy_9(vtkCellAttribute id0,boolean id1);
  public void ShallowCopy(vtkCellAttribute id0,boolean id1)
  {
    ShallowCopy_9(id0,id1);
  }

  private native byte[] EncodeSpace_10(byte[] id0, int len0,int id1,int id2);
  public String EncodeSpace(String id0,int id1,int id2)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return new String(EncodeSpace_10(bytes0, bytes0.length,id1,id2), StandardCharsets.UTF_8);
  }

  public vtkCellAttribute() { super(); }

  public vtkCellAttribute(long id) { super(id); }
  public native long   VTKInit();

}
