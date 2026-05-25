// java wrapper for vtkHDFWriter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkHDFWriter extends vtkWriter
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

  private native void SetController_4(vtkMultiProcessController id0);
  public void SetController(vtkMultiProcessController id0)
  {
    SetController_4(id0);
  }

  private native long GetController_5();
  public vtkMultiProcessController GetController()
  {
    long temp = GetController_5();

    if (temp == 0) return null;
    return (vtkMultiProcessController)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetFileName_6(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_6(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_7();
  public String GetFileName()
  {
    return new String(GetFileName_7(), StandardCharsets.UTF_8);
  }

  private native void SetOverwrite_8(boolean id0);
  public void SetOverwrite(boolean id0)
  {
    SetOverwrite_8(id0);
  }

  private native boolean GetOverwrite_9();
  public boolean GetOverwrite()
  {
    return GetOverwrite_9();
  }

  private native void SetWriteAllTimeSteps_10(boolean id0);
  public void SetWriteAllTimeSteps(boolean id0)
  {
    SetWriteAllTimeSteps_10(id0);
  }

  private native boolean GetWriteAllTimeSteps_11();
  public boolean GetWriteAllTimeSteps()
  {
    return GetWriteAllTimeSteps_11();
  }

  private native void SetChunkSize_12(int id0);
  public void SetChunkSize(int id0)
  {
    SetChunkSize_12(id0);
  }

  private native int GetChunkSize_13();
  public int GetChunkSize()
  {
    return GetChunkSize_13();
  }

  private native void SetCompressionLevel_14(int id0);
  public void SetCompressionLevel(int id0)
  {
    SetCompressionLevel_14(id0);
  }

  private native int GetCompressionLevelMinValue_15();
  public int GetCompressionLevelMinValue()
  {
    return GetCompressionLevelMinValue_15();
  }

  private native int GetCompressionLevelMaxValue_16();
  public int GetCompressionLevelMaxValue()
  {
    return GetCompressionLevelMaxValue_16();
  }

  private native int GetCompressionLevel_17();
  public int GetCompressionLevel()
  {
    return GetCompressionLevel_17();
  }

  private native void SetUseExternalComposite_18(boolean id0);
  public void SetUseExternalComposite(boolean id0)
  {
    SetUseExternalComposite_18(id0);
  }

  private native boolean GetUseExternalComposite_19();
  public boolean GetUseExternalComposite()
  {
    return GetUseExternalComposite_19();
  }

  private native void SetUseExternalTimeSteps_20(boolean id0);
  public void SetUseExternalTimeSteps(boolean id0)
  {
    SetUseExternalTimeSteps_20(id0);
  }

  private native boolean GetUseExternalTimeSteps_21();
  public boolean GetUseExternalTimeSteps()
  {
    return GetUseExternalTimeSteps_21();
  }

  private native void SetUseExternalPartitions_22(boolean id0);
  public void SetUseExternalPartitions(boolean id0)
  {
    SetUseExternalPartitions_22(id0);
  }

  private native boolean GetUseExternalPartitions_23();
  public boolean GetUseExternalPartitions()
  {
    return GetUseExternalPartitions_23();
  }

  public vtkHDFWriter() { super(); }

  public vtkHDFWriter(long id) { super(id); }
  public native long   VTKInit();

}
