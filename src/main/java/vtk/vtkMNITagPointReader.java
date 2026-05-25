// java wrapper for vtkMNITagPointReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMNITagPointReader extends vtkPolyDataAlgorithm
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

  private native void SetFileName_4(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_4(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_5();
  public String GetFileName()
  {
    return new String(GetFileName_5(), StandardCharsets.UTF_8);
  }

  private native byte[] GetFileExtensions_6();
  public String GetFileExtensions()
  {
    return new String(GetFileExtensions_6(), StandardCharsets.UTF_8);
  }

  private native byte[] GetDescriptiveName_7();
  public String GetDescriptiveName()
  {
    return new String(GetDescriptiveName_7(), StandardCharsets.UTF_8);
  }

  private native int CanReadFile_8(byte[] id0, int len0);
  public int CanReadFile(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return CanReadFile_8(bytes0, bytes0.length);
  }

  private native int GetNumberOfVolumes_9();
  public int GetNumberOfVolumes()
  {
    return GetNumberOfVolumes_9();
  }

  private native long GetPoints_10(int id0);
  public vtkPoints GetPoints(int id0)
  {
    long temp = GetPoints_10(id0);

    if (temp == 0) return null;
    return (vtkPoints)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPoints_11();
  public vtkPoints GetPoints()
  {
    long temp = GetPoints_11();

    if (temp == 0) return null;
    return (vtkPoints)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetLabelText_12();
  public vtkStringArray GetLabelText()
  {
    long temp = GetLabelText_12();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetWeights_13();
  public vtkDoubleArray GetWeights()
  {
    long temp = GetWeights_13();

    if (temp == 0) return null;
    return (vtkDoubleArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetStructureIds_14();
  public vtkIntArray GetStructureIds()
  {
    long temp = GetStructureIds_14();

    if (temp == 0) return null;
    return (vtkIntArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPatientIds_15();
  public vtkIntArray GetPatientIds()
  {
    long temp = GetPatientIds_15();

    if (temp == 0) return null;
    return (vtkIntArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native byte[] GetComments_16();
  public String GetComments()
  {
    return new String(GetComments_16(), StandardCharsets.UTF_8);
  }

  public vtkMNITagPointReader() { super(); }

  public vtkMNITagPointReader(long id) { super(id); }
  public native long   VTKInit();

}
