// java wrapper for vtkImageSliceCollection object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageSliceCollection extends vtkPropCollection
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

  private native void Sort_4();
  public void Sort()
  {
    Sort_4();
  }

  private native void AddItem_5(vtkImageSlice id0);
  public void AddItem(vtkImageSlice id0)
  {
    AddItem_5(id0);
  }

  private native long GetNextImage_6();
  public vtkImageSlice GetNextImage()
  {
    long temp = GetNextImage_6();

    if (temp == 0) return null;
    return (vtkImageSlice)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetNextItem_7();
  public vtkImageSlice GetNextItem()
  {
    long temp = GetNextItem_7();

    if (temp == 0) return null;
    return (vtkImageSlice)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkImageSliceCollection() { super(); }

  public vtkImageSliceCollection(long id) { super(id); }
  public native long   VTKInit();

}
