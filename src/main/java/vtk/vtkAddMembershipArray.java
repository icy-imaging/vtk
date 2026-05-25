// java wrapper for vtkAddMembershipArray object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAddMembershipArray extends vtkPassInputTypeAlgorithm
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

  private native int GetFieldType_4();
  public int GetFieldType()
  {
    return GetFieldType_4();
  }

  private native void SetFieldType_5(int id0);
  public void SetFieldType(int id0)
  {
    SetFieldType_5(id0);
  }

  private native int GetFieldTypeMinValue_6();
  public int GetFieldTypeMinValue()
  {
    return GetFieldTypeMinValue_6();
  }

  private native int GetFieldTypeMaxValue_7();
  public int GetFieldTypeMaxValue()
  {
    return GetFieldTypeMaxValue_7();
  }

  private native void SetOutputArrayName_8(byte[] id0, int len0);
  public void SetOutputArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetOutputArrayName_8(bytes0, bytes0.length);
  }

  private native byte[] GetOutputArrayName_9();
  public String GetOutputArrayName()
  {
    return new String(GetOutputArrayName_9(), StandardCharsets.UTF_8);
  }

  private native void SetInputArrayName_10(byte[] id0, int len0);
  public void SetInputArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetInputArrayName_10(bytes0, bytes0.length);
  }

  private native byte[] GetInputArrayName_11();
  public String GetInputArrayName()
  {
    return new String(GetInputArrayName_11(), StandardCharsets.UTF_8);
  }

  private native void SetInputValues_12(vtkAbstractArray id0);
  public void SetInputValues(vtkAbstractArray id0)
  {
    SetInputValues_12(id0);
  }

  private native long GetInputValues_13();
  public vtkAbstractArray GetInputValues()
  {
    long temp = GetInputValues_13();

    if (temp == 0) return null;
    return (vtkAbstractArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkAddMembershipArray() { super(); }

  public vtkAddMembershipArray(long id) { super(id); }
  public native long   VTKInit();

}
