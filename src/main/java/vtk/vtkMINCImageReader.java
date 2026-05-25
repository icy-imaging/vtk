// java wrapper for vtkMINCImageReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMINCImageReader extends vtkImageReader2
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

  private native byte[] GetFileExtensions_5();
  public String GetFileExtensions()
  {
    return new String(GetFileExtensions_5(), StandardCharsets.UTF_8);
  }

  private native byte[] GetDescriptiveName_6();
  public String GetDescriptiveName()
  {
    return new String(GetDescriptiveName_6(), StandardCharsets.UTF_8);
  }

  private native int CanReadFile_7(byte[] id0, int len0);
  public int CanReadFile(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return CanReadFile_7(bytes0, bytes0.length);
  }

  private native long GetDirectionCosines_8();
  public vtkMatrix4x4 GetDirectionCosines()
  {
    long temp = GetDirectionCosines_8();

    if (temp == 0) return null;
    return (vtkMatrix4x4)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native double GetRescaleSlope_9();
  public double GetRescaleSlope()
  {
    return GetRescaleSlope_9();
  }

  private native double GetRescaleIntercept_10();
  public double GetRescaleIntercept()
  {
    return GetRescaleIntercept_10();
  }

  private native void SetRescaleRealValues_11(int id0);
  public void SetRescaleRealValues(int id0)
  {
    SetRescaleRealValues_11(id0);
  }

  private native void RescaleRealValuesOn_12();
  public void RescaleRealValuesOn()
  {
    RescaleRealValuesOn_12();
  }

  private native void RescaleRealValuesOff_13();
  public void RescaleRealValuesOff()
  {
    RescaleRealValuesOff_13();
  }

  private native int GetRescaleRealValues_14();
  public int GetRescaleRealValues()
  {
    return GetRescaleRealValues_14();
  }

  private native double[] GetDataRange_15();
  public double[] GetDataRange()
  {
    return GetDataRange_15();
  }

  private native void GetDataRange_16(double id0[]);
  public void GetDataRange(double id0[])
  {
    GetDataRange_16(id0);
  }

  private native int GetNumberOfTimeSteps_17();
  public int GetNumberOfTimeSteps()
  {
    return GetNumberOfTimeSteps_17();
  }

  private native void SetTimeStep_18(int id0);
  public void SetTimeStep(int id0)
  {
    SetTimeStep_18(id0);
  }

  private native int GetTimeStep_19();
  public int GetTimeStep()
  {
    return GetTimeStep_19();
  }

  private native long GetImageAttributes_20();
  public vtkMINCImageAttributes GetImageAttributes()
  {
    long temp = GetImageAttributes_20();

    if (temp == 0) return null;
    return (vtkMINCImageAttributes)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkMINCImageReader() { super(); }

  public vtkMINCImageReader(long id) { super(id); }
  public native long   VTKInit();

}
