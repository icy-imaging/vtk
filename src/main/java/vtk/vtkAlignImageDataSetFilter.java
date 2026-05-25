// java wrapper for vtkAlignImageDataSetFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAlignImageDataSetFilter extends vtkPassInputTypeAlgorithm
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

  private native void SetMinimumExtent_6(int id0,int id1,int id2);
  public void SetMinimumExtent(int id0,int id1,int id2)
  {
    SetMinimumExtent_6(id0,id1,id2);
  }

  private native void SetMinimumExtent_7(int id0[]);
  public void SetMinimumExtent(int id0[])
  {
    SetMinimumExtent_7(id0);
  }

  private native int[] GetMinimumExtent_8();
  public int[] GetMinimumExtent()
  {
    return GetMinimumExtent_8();
  }

  public vtkAlignImageDataSetFilter() { super(); }

  public vtkAlignImageDataSetFilter(long id) { super(id); }
  public native long   VTKInit();

}
