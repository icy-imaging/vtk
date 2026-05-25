// java wrapper for vtkAttributeDataToFieldDataFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAttributeDataToFieldDataFilter extends vtkDataSetAlgorithm
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

  private native void SetPassAttributeData_4(int id0);
  public void SetPassAttributeData(int id0)
  {
    SetPassAttributeData_4(id0);
  }

  private native int GetPassAttributeData_5();
  public int GetPassAttributeData()
  {
    return GetPassAttributeData_5();
  }

  private native void PassAttributeDataOn_6();
  public void PassAttributeDataOn()
  {
    PassAttributeDataOn_6();
  }

  private native void PassAttributeDataOff_7();
  public void PassAttributeDataOff()
  {
    PassAttributeDataOff_7();
  }

  public vtkAttributeDataToFieldDataFilter() { super(); }

  public vtkAttributeDataToFieldDataFilter(long id) { super(id); }
  public native long   VTKInit();

}
