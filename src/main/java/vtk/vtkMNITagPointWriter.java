// java wrapper for vtkMNITagPointWriter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMNITagPointWriter extends vtkWriter
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

  private native byte[] GetFileExtensions_4();
  public String GetFileExtensions()
  {
    return new String(GetFileExtensions_4(), StandardCharsets.UTF_8);
  }

  private native byte[] GetDescriptiveName_5();
  public String GetDescriptiveName()
  {
    return new String(GetDescriptiveName_5(), StandardCharsets.UTF_8);
  }

  private native void SetPoints_6(int id0,vtkPoints id1);
  public void SetPoints(int id0,vtkPoints id1)
  {
    SetPoints_6(id0,id1);
  }

  private native void SetPoints_7(vtkPoints id0);
  public void SetPoints(vtkPoints id0)
  {
    SetPoints_7(id0);
  }

  private native long GetPoints_8(int id0);
  public vtkPoints GetPoints(int id0)
  {
    long temp = GetPoints_8(id0);

    if (temp == 0) return null;
    return (vtkPoints)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPoints_9();
  public vtkPoints GetPoints()
  {
    long temp = GetPoints_9();

    if (temp == 0) return null;
    return (vtkPoints)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLabelText_10(vtkStringArray id0);
  public void SetLabelText(vtkStringArray id0)
  {
    SetLabelText_10(id0);
  }

  private native long GetLabelText_11();
  public vtkStringArray GetLabelText()
  {
    long temp = GetLabelText_11();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetWeights_12(vtkDoubleArray id0);
  public void SetWeights(vtkDoubleArray id0)
  {
    SetWeights_12(id0);
  }

  private native long GetWeights_13();
  public vtkDoubleArray GetWeights()
  {
    long temp = GetWeights_13();

    if (temp == 0) return null;
    return (vtkDoubleArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetStructureIds_14(vtkIntArray id0);
  public void SetStructureIds(vtkIntArray id0)
  {
    SetStructureIds_14(id0);
  }

  private native long GetStructureIds_15();
  public vtkIntArray GetStructureIds()
  {
    long temp = GetStructureIds_15();

    if (temp == 0) return null;
    return (vtkIntArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPatientIds_16(vtkIntArray id0);
  public void SetPatientIds(vtkIntArray id0)
  {
    SetPatientIds_16(id0);
  }

  private native long GetPatientIds_17();
  public vtkIntArray GetPatientIds()
  {
    long temp = GetPatientIds_17();

    if (temp == 0) return null;
    return (vtkIntArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetComments_18(byte[] id0, int len0);
  public void SetComments(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetComments_18(bytes0, bytes0.length);
  }

  private native byte[] GetComments_19();
  public String GetComments()
  {
    return new String(GetComments_19(), StandardCharsets.UTF_8);
  }

  private native int Write_20();
  public int Write()
  {
    return Write_20();
  }

  private native long GetMTime_21();
  public long GetMTime()
  {
    return GetMTime_21();
  }

  private native void SetFileName_22(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_22(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_23();
  public String GetFileName()
  {
    return new String(GetFileName_23(), StandardCharsets.UTF_8);
  }

  public vtkMNITagPointWriter() { super(); }

  public vtkMNITagPointWriter(long id) { super(id); }
  public native long   VTKInit();

}
