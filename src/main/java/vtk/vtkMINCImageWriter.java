// java wrapper for vtkMINCImageWriter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMINCImageWriter extends vtkImageWriter
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

  private native void SetFileName_6(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_6(bytes0, bytes0.length);
  }

  private native void Write_7();
  public void Write()
  {
    Write_7();
  }

  private native void SetDirectionCosines_8(vtkMatrix4x4 id0);
  public void SetDirectionCosines(vtkMatrix4x4 id0)
  {
    SetDirectionCosines_8(id0);
  }

  private native long GetDirectionCosines_9();
  public vtkMatrix4x4 GetDirectionCosines()
  {
    long temp = GetDirectionCosines_9();

    if (temp == 0) return null;
    return (vtkMatrix4x4)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetRescaleSlope_10(double id0);
  public void SetRescaleSlope(double id0)
  {
    SetRescaleSlope_10(id0);
  }

  private native double GetRescaleSlope_11();
  public double GetRescaleSlope()
  {
    return GetRescaleSlope_11();
  }

  private native void SetRescaleIntercept_12(double id0);
  public void SetRescaleIntercept(double id0)
  {
    SetRescaleIntercept_12(id0);
  }

  private native double GetRescaleIntercept_13();
  public double GetRescaleIntercept()
  {
    return GetRescaleIntercept_13();
  }

  private native void SetImageAttributes_14(vtkMINCImageAttributes id0);
  public void SetImageAttributes(vtkMINCImageAttributes id0)
  {
    SetImageAttributes_14(id0);
  }

  private native long GetImageAttributes_15();
  public vtkMINCImageAttributes GetImageAttributes()
  {
    long temp = GetImageAttributes_15();

    if (temp == 0) return null;
    return (vtkMINCImageAttributes)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetStrictValidation_16(int id0);
  public void SetStrictValidation(int id0)
  {
    SetStrictValidation_16(id0);
  }

  private native void StrictValidationOn_17();
  public void StrictValidationOn()
  {
    StrictValidationOn_17();
  }

  private native void StrictValidationOff_18();
  public void StrictValidationOff()
  {
    StrictValidationOff_18();
  }

  private native int GetStrictValidation_19();
  public int GetStrictValidation()
  {
    return GetStrictValidation_19();
  }

  private native void SetHistoryAddition_20(byte[] id0, int len0);
  public void SetHistoryAddition(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetHistoryAddition_20(bytes0, bytes0.length);
  }

  private native byte[] GetHistoryAddition_21();
  public String GetHistoryAddition()
  {
    return new String(GetHistoryAddition_21(), StandardCharsets.UTF_8);
  }

  public vtkMINCImageWriter() { super(); }

  public vtkMINCImageWriter(long id) { super(id); }
  public native long   VTKInit();

}
