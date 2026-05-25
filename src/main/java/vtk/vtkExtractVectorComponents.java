// java wrapper for vtkExtractVectorComponents object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkExtractVectorComponents extends vtkDataSetAlgorithm
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

  private native void SetInputData_4(vtkDataSet id0);
  public void SetInputData(vtkDataSet id0)
  {
    SetInputData_4(id0);
  }

  private native long GetVxComponent_5();
  public vtkDataSet GetVxComponent()
  {
    long temp = GetVxComponent_5();

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetVyComponent_6();
  public vtkDataSet GetVyComponent()
  {
    long temp = GetVyComponent_6();

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetVzComponent_7();
  public vtkDataSet GetVzComponent()
  {
    long temp = GetVzComponent_7();

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetExtractToFieldData_8(int id0);
  public void SetExtractToFieldData(int id0)
  {
    SetExtractToFieldData_8(id0);
  }

  private native int GetExtractToFieldData_9();
  public int GetExtractToFieldData()
  {
    return GetExtractToFieldData_9();
  }

  private native void ExtractToFieldDataOn_10();
  public void ExtractToFieldDataOn()
  {
    ExtractToFieldDataOn_10();
  }

  private native void ExtractToFieldDataOff_11();
  public void ExtractToFieldDataOff()
  {
    ExtractToFieldDataOff_11();
  }

  public vtkExtractVectorComponents() { super(); }

  public vtkExtractVectorComponents(long id) { super(id); }
  public native long   VTKInit();

}
