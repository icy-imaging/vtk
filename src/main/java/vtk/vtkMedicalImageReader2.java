// java wrapper for vtkMedicalImageReader2 object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMedicalImageReader2 extends vtkImageReader2
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

  private native long GetMedicalImageProperties_4();
  public vtkMedicalImageProperties GetMedicalImageProperties()
  {
    long temp = GetMedicalImageProperties_4();

    if (temp == 0) return null;
    return (vtkMedicalImageProperties)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPatientName_5(byte[] id0, int len0);
  public void SetPatientName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPatientName_5(bytes0, bytes0.length);
  }

  private native byte[] GetPatientName_6();
  public String GetPatientName()
  {
    return new String(GetPatientName_6(), StandardCharsets.UTF_8);
  }

  private native void SetPatientID_7(byte[] id0, int len0);
  public void SetPatientID(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPatientID_7(bytes0, bytes0.length);
  }

  private native byte[] GetPatientID_8();
  public String GetPatientID()
  {
    return new String(GetPatientID_8(), StandardCharsets.UTF_8);
  }

  private native void SetDate_9(byte[] id0, int len0);
  public void SetDate(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetDate_9(bytes0, bytes0.length);
  }

  private native byte[] GetDate_10();
  public String GetDate()
  {
    return new String(GetDate_10(), StandardCharsets.UTF_8);
  }

  private native void SetSeries_11(byte[] id0, int len0);
  public void SetSeries(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetSeries_11(bytes0, bytes0.length);
  }

  private native byte[] GetSeries_12();
  public String GetSeries()
  {
    return new String(GetSeries_12(), StandardCharsets.UTF_8);
  }

  private native void SetStudy_13(byte[] id0, int len0);
  public void SetStudy(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetStudy_13(bytes0, bytes0.length);
  }

  private native byte[] GetStudy_14();
  public String GetStudy()
  {
    return new String(GetStudy_14(), StandardCharsets.UTF_8);
  }

  private native void SetImageNumber_15(byte[] id0, int len0);
  public void SetImageNumber(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetImageNumber_15(bytes0, bytes0.length);
  }

  private native byte[] GetImageNumber_16();
  public String GetImageNumber()
  {
    return new String(GetImageNumber_16(), StandardCharsets.UTF_8);
  }

  private native void SetModality_17(byte[] id0, int len0);
  public void SetModality(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetModality_17(bytes0, bytes0.length);
  }

  private native byte[] GetModality_18();
  public String GetModality()
  {
    return new String(GetModality_18(), StandardCharsets.UTF_8);
  }

  public vtkMedicalImageReader2() { super(); }

  public vtkMedicalImageReader2(long id) { super(id); }
  public native long   VTKInit();

}
