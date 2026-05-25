// java wrapper for vtkMergeVectorComponents object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMergeVectorComponents extends vtkPassInputTypeAlgorithm
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

  private native void SetXArrayName_4(byte[] id0, int len0);
  public void SetXArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetXArrayName_4(bytes0, bytes0.length);
  }

  private native byte[] GetXArrayName_5();
  public String GetXArrayName()
  {
    return new String(GetXArrayName_5(), StandardCharsets.UTF_8);
  }

  private native void SetYArrayName_6(byte[] id0, int len0);
  public void SetYArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetYArrayName_6(bytes0, bytes0.length);
  }

  private native byte[] GetYArrayName_7();
  public String GetYArrayName()
  {
    return new String(GetYArrayName_7(), StandardCharsets.UTF_8);
  }

  private native void SetZArrayName_8(byte[] id0, int len0);
  public void SetZArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetZArrayName_8(bytes0, bytes0.length);
  }

  private native byte[] GetZArrayName_9();
  public String GetZArrayName()
  {
    return new String(GetZArrayName_9(), StandardCharsets.UTF_8);
  }

  private native void SetOutputVectorName_10(byte[] id0, int len0);
  public void SetOutputVectorName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetOutputVectorName_10(bytes0, bytes0.length);
  }

  private native byte[] GetOutputVectorName_11();
  public String GetOutputVectorName()
  {
    return new String(GetOutputVectorName_11(), StandardCharsets.UTF_8);
  }

  private native void SetAttributeType_12(int id0);
  public void SetAttributeType(int id0)
  {
    SetAttributeType_12(id0);
  }

  private native int GetAttributeType_13();
  public int GetAttributeType()
  {
    return GetAttributeType_13();
  }

  private native void SetAttributeTypeToPointData_14();
  public void SetAttributeTypeToPointData()
  {
    SetAttributeTypeToPointData_14();
  }

  private native void SetAttributeTypeToCellData_15();
  public void SetAttributeTypeToCellData()
  {
    SetAttributeTypeToCellData_15();
  }

  public vtkMergeVectorComponents() { super(); }

  public vtkMergeVectorComponents(long id) { super(id); }
  public native long   VTKInit();

}
