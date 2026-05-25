// java wrapper for vtkMNIObjectWriter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMNIObjectWriter extends vtkWriter
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

  private native void SetProperty_6(vtkProperty id0);
  public void SetProperty(vtkProperty id0)
  {
    SetProperty_6(id0);
  }

  private native long GetProperty_7();
  public vtkProperty GetProperty()
  {
    long temp = GetProperty_7();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetMapper_8(vtkMapper id0);
  public void SetMapper(vtkMapper id0)
  {
    SetMapper_8(id0);
  }

  private native long GetMapper_9();
  public vtkMapper GetMapper()
  {
    long temp = GetMapper_9();

    if (temp == 0) return null;
    return (vtkMapper)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLookupTable_10(vtkLookupTable id0);
  public void SetLookupTable(vtkLookupTable id0)
  {
    SetLookupTable_10(id0);
  }

  private native long GetLookupTable_11();
  public vtkLookupTable GetLookupTable()
  {
    long temp = GetLookupTable_11();

    if (temp == 0) return null;
    return (vtkLookupTable)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInput_12();
  public vtkPolyData GetInput()
  {
    long temp = GetInput_12();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInput_13(int id0);
  public vtkPolyData GetInput(int id0)
  {
    long temp = GetInput_13(id0);

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetFileName_14(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_14(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_15();
  public String GetFileName()
  {
    return new String(GetFileName_15(), StandardCharsets.UTF_8);
  }

  private native void SetFileType_16(int id0);
  public void SetFileType(int id0)
  {
    SetFileType_16(id0);
  }

  private native int GetFileTypeMinValue_17();
  public int GetFileTypeMinValue()
  {
    return GetFileTypeMinValue_17();
  }

  private native int GetFileTypeMaxValue_18();
  public int GetFileTypeMaxValue()
  {
    return GetFileTypeMaxValue_18();
  }

  private native int GetFileType_19();
  public int GetFileType()
  {
    return GetFileType_19();
  }

  private native void SetFileTypeToASCII_20();
  public void SetFileTypeToASCII()
  {
    SetFileTypeToASCII_20();
  }

  private native void SetFileTypeToBinary_21();
  public void SetFileTypeToBinary()
  {
    SetFileTypeToBinary_21();
  }

  public vtkMNIObjectWriter() { super(); }

  public vtkMNIObjectWriter(long id) { super(id); }
  public native long   VTKInit();

}
