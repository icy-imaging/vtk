// java wrapper for vtkTransferAttributes object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTransferAttributes extends vtkPassInputTypeAlgorithm
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

  private native void SetDirectMapping_4(boolean id0);
  public void SetDirectMapping(boolean id0)
  {
    SetDirectMapping_4(id0);
  }

  private native boolean GetDirectMapping_5();
  public boolean GetDirectMapping()
  {
    return GetDirectMapping_5();
  }

  private native void DirectMappingOn_6();
  public void DirectMappingOn()
  {
    DirectMappingOn_6();
  }

  private native void DirectMappingOff_7();
  public void DirectMappingOff()
  {
    DirectMappingOff_7();
  }

  private native byte[] GetSourceArrayName_8();
  public String GetSourceArrayName()
  {
    return new String(GetSourceArrayName_8(), StandardCharsets.UTF_8);
  }

  private native void SetSourceArrayName_9(byte[] id0, int len0);
  public void SetSourceArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetSourceArrayName_9(bytes0, bytes0.length);
  }

  private native byte[] GetTargetArrayName_10();
  public String GetTargetArrayName()
  {
    return new String(GetTargetArrayName_10(), StandardCharsets.UTF_8);
  }

  private native void SetTargetArrayName_11(byte[] id0, int len0);
  public void SetTargetArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetTargetArrayName_11(bytes0, bytes0.length);
  }

  private native int GetSourceFieldType_12();
  public int GetSourceFieldType()
  {
    return GetSourceFieldType_12();
  }

  private native void SetSourceFieldType_13(int id0);
  public void SetSourceFieldType(int id0)
  {
    SetSourceFieldType_13(id0);
  }

  private native int GetTargetFieldType_14();
  public int GetTargetFieldType()
  {
    return GetTargetFieldType_14();
  }

  private native void SetTargetFieldType_15(int id0);
  public void SetTargetFieldType(int id0)
  {
    SetTargetFieldType_15(id0);
  }

  private native int FillInputPortInformation_16(int id0,vtkInformation id1);
  public int FillInputPortInformation(int id0,vtkInformation id1)
  {
    return FillInputPortInformation_16(id0,id1);
  }

  public vtkTransferAttributes() { super(); }

  public vtkTransferAttributes(long id) { super(id); }
  public native long   VTKInit();

}
