// java wrapper for vtkLZ4DataCompressor object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkLZ4DataCompressor extends vtkDataCompressor
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

  private native int GetCompressionLevel_4();
  public int GetCompressionLevel()
  {
    return GetCompressionLevel_4();
  }

  private native void SetCompressionLevel_5(int id0);
  public void SetCompressionLevel(int id0)
  {
    SetCompressionLevel_5(id0);
  }

  private native void SetAccelerationLevel_6(int id0);
  public void SetAccelerationLevel(int id0)
  {
    SetAccelerationLevel_6(id0);
  }

  private native int GetAccelerationLevelMinValue_7();
  public int GetAccelerationLevelMinValue()
  {
    return GetAccelerationLevelMinValue_7();
  }

  private native int GetAccelerationLevelMaxValue_8();
  public int GetAccelerationLevelMaxValue()
  {
    return GetAccelerationLevelMaxValue_8();
  }

  private native int GetAccelerationLevel_9();
  public int GetAccelerationLevel()
  {
    return GetAccelerationLevel_9();
  }

  public vtkLZ4DataCompressor() { super(); }

  public vtkLZ4DataCompressor(long id) { super(id); }
  public native long   VTKInit();

}
